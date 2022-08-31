#following a guide to learn the basics about the spotify api
import base64
import requests
import datetime
from urllib.parse import urlencode

client_id = '8d6d6e65355240ed9ee6ae899d141170'
client_secret = 'd48fc064a762416dbf3545667629de0e'

class SpotifyAPI(object):
    access_token = None
    access_token_expires = datetime.datetime.now()
    access_token_did_expire = True
    client_id = None
    client_secret = None
    token_url = "https://accounts.spotify.com/api/token"

    def __init__(self, client_id,client_secret, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.client_id = client_id
        self.client_secret = client_secret


    def get_client_creds(self):
        """returns base64 endoded string"""
        client_id = self.client_id
        client_secret = self.client_secret

        if client_secret == None or client_id == None:
            raise Exception("need to set id and secret")
        client_creds = f"{client_id}:{client_secret}"
        client_creds_b64 = base64.b64encode(client_creds.encode())
        return client_creds_b64.decode()


    def get_token_headers(self):
        client_creds_b64 = self.get_client_creds()
        return {
            "Authorization": f"Basic {client_creds_b64}"
            }
    
    def get_token_data(self):
        return  {
            "grant_type": "client_credentials"
            }

#performs authentication needed for every request
    def perfrom_auth(self):
        token_url = self.token_url
        token_data = self.get_token_data()
        token_headers = self.get_token_headers()
        r = requests.post(url=token_url, data=token_data, headers=token_headers)
        
        if r.status_code not in range(200,299):
            raise Exception('could not auth')
            # return False
        data = r.json()
        now = datetime.datetime.now()
        access_token = data["access_token"]
        expires = data["expires_in"]
        time_to_expire = now + datetime.timedelta(seconds=expires)
        self.access_token = access_token
        self.access_token_expires = time_to_expire
        self.access_token_did_expire = time_to_expire < now
        return True
    

    def get_access_token(self):
        auth_done = self.perfrom_auth()
        if not auth_done:
            raise Exception("auth failed")
        token = self.access_token
        expires = self.access_token_expires
        now = datetime.datetime.now()

        if expires < now:
            self.perform_auth()
            return self.get_access_token()

        elif token == None:
            self.perform_auth()
            return self.get_access_token()

        return token
    
    def get_access_headers(self):
        access_token = self.get_access_token()

        headers = {
            "Authorization": f"Bearer {access_token}"
            }
        return headers
    
    def get_resource(self, _id, resource_type="albums", version="v1"):
        endpoint = f"https://api.spotify.com/{version}/{resource_type}/{_id}"
        headers = self.get_access_headers()
        r = requests.get(endpoint, headers=headers)
        if r.status_code not in range(200,299):
            return {}
        return r.json()
        pass

    def get_album(self, _id): 
        return self.get_resource(_id,resource_type="albums", version="v1")

    def get_artist(self, _id):
        return self.get_resource(_id,resource_type="artists", version="v1")


    def search(self,query,search_type="artist"):
        access_token = self.get_access_token()

        headers = self.get_access_headers()

        #just general search
        endpoint = "https://api.spotify.com/v1/search"
        data = urlencode({"q":query, "type":search_type.lower()})
        print(data)
        lookup_url = f"{endpoint}?{data}"
        print(lookup_url)
        r = requests.get(lookup_url, headers=headers)
        if r.status_code not in range(200,299):
            return {}

        data = (r.json())
        return data


client = SpotifyAPI(client_id,client_secret)
print(client.search("I am all of me",search_type="Track"))
print(client.get_artist("4ShgdWtm52xvEr8uYmT0V6"))



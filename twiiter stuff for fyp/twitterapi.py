import requests
import tweepy
import pandas as pd
import time
# import openpyxl

# all the api keys
api_key = "H2stUS5brlYYEoznyxOPTNctW"
api_secret = "2eMQ4ZTV6ThlcRYPVW8cNHh5mGOhi26JcXcxLtOihYALaWSXTm"
access_token = "1504482408392904709-N5ILpyFmffn0IEZLqpTaEnMg8pSp6R"
access_secret = "VYKgAoBPh7bIkvNuMFRI0ixiG97egPe3v7ZyKwXNQgBpG"
bearer_token='AAAAAAAAAAAAAAAAAAAAANUmhAEAAAAAUeYWyb%2BJ1ulqC9p0SFHVW%2FgOL0c%3DTrvOfpDNEdQ18gFWw2dDnnzb5umsM1h93SmsN2rtBUUv8SXSFQ'


client = tweepy.Client(bearer_token)
# auth = tweepy.OAuth1UserHandler(api_key, api_secret, access_token, access_secret)
auth = tweepy.OAuth2BearerHandler(bearer_token)
api = tweepy.API(auth)
query = 'ukraine'

# Bot searches for tweets containing certain keywords
class MyStream(tweepy.StreamingClient):

    # This function gets called when the stream is working
    def on_connect(self):

        print("Connected")


    # This function gets called when a tweet passes the stream
    def on_tweet(self, tweet):

        # Displaying tweet in console
        if tweet.referenced_tweets == None:
            print(tweet.text)
            client.like(tweet.id)

            # Delay between tweets
            time.sleep(0.5)
        

# Creating Stream object
stream = MyStream(bearer_token=bearer_token)

# Adding terms to search rules
# It's important to know that these rules don't get deleted when you stop the
# program, so you'd need to use stream.get_rules() and stream.delete_rules()
# to change them, or you can use the optional parameter to stream.add_rules()
# called dry_run (set it to True, and the rules will get deleted after the bot
# stopped running).
# for term in search_terms:
stream.add_rules(tweepy.StreamRule(query))

# Starting stream
stream.filter(tweet_fields=["referenced_tweets"])
# tweets = client.search_recent_tweets(query=query, tweet_fields=['public_metrics', 'created_at'], max_results=100)
# count = 1

# results = []

# # query = f""
# for tweet in tweepy.Paginator(client.search_recent_tweets,query=,
#                               tweet_fields=['entities', 'created_at'], max_results=100).flatten(limit=300):
#     print(count)
#     print(tweet.text)
#     print("------------------")
#     # print(tweet.entities)
#     # print("------------------")
#     if tweet.entities is not None and "urls" in tweet.entities:
#         print(tweet.entities['urls'])
#         # for url in tweet.entities['urls']:
#         #     print(url['expanded_url'])
#         #     if url['expanded_url'] not in results:
#         #         results.append(url['expanded_url'])
#         #     print("*****************")

#     # count += 1

#     # print(len(results))

# # data = pd.DataFrame({"url": results})
# # data.to_excel('results.xlsx', sheet_name='sheet1', index=False)
# # for tweet in tweets.data:
# #     print(count)
# #     print(tweet.text)
# #     if len(tweet.public_metrics) > 0:
# #         print(tweet.public_metrics)
# #     print("--------------------------------")
# #     count += 1
# # use tweepy to authenticate to twitter
# # auth = tweepy.OAuthHandler(api_key, api_secret)
# # auth.set_access_token(access_token, access_secret)
# #
# # api = tweepy.API(auth)
# #
# # api.verify_credentials()
# # try:
# #     print(api.verify_credentials())
# #     print('Successful Authentication')
# # except :
# #     print('Failed authentication')

# # class Twitter(object):
# #
# #     # def __init__(self):
# #
# #     def search(self, query):
# #         res = requests.get(query)

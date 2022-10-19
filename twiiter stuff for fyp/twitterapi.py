import requests
import tweepy
import pandas as pd
import openpyxl

# all the api keys
api_key = "H2stUS5brlYYEoznyxOPTNctW"
api_secret = "2eMQ4ZTV6ThlcRYPVW8cNHh5mGOhi26JcXcxLtOihYALaWSXTm"
access_token = "1504482408392904709-N9utQi1sHFENJPdYaOIjlc56JKWlLc"
access_secret = "34JMyPVGtNxUnORuDyiqQIZeXz7go5uePcz9bNR9J1kA8"

client = tweepy.Client(
    bearer_token='AAAAAAAAAAAAAAAAAAAAANUmhAEAAAAAUeYWyb%2BJ1ulqC9p0SFHVW%2FgOL0c%3DTrvOfpDNEdQ18gFWw2dDnnzb5umsM1h93SmsN2rtBUUv8SXSFQ')

query = 'ukraine'

# tweets = client.search_recent_tweets(query=query, tweet_fields=['public_metrics', 'created_at'], max_results=100)
count = 1

results = []

query = f""
for tweet in tweepy.Paginator(client.search_recent_tweets, query=query,
                              tweet_fields=['entities', 'created_at'], max_results=100).flatten(limit=1000):
    print(count)
    print(tweet.text)
    print("------------------")
    # print(tweet.entities)
    # print("------------------")
    if tweet.entities is not None and "urls" in tweet.entities:
        for url in tweet.entities['urls']:
            print(url['expanded_url'])
            if url['expanded_url'] not in results:
                results.append(url['expanded_url'])
            print("*****************")

    count += 1

    print(len(results))

data = pd.DataFrame({"url": results})
data.to_excel('results.xlsx', sheet_name='sheet1', index=False)
# for tweet in tweets.data:
#     print(count)
#     print(tweet.text)
#     if len(tweet.public_metrics) > 0:
#         print(tweet.public_metrics)
#     print("--------------------------------")
#     count += 1
# use tweepy to authenticate to twitter
# auth = tweepy.OAuthHandler(api_key, api_secret)
# auth.set_access_token(access_token, access_secret)
#
# api = tweepy.API(auth)
#
# api.verify_credentials()
# try:
#     print(api.verify_credentials())
#     print('Successful Authentication')
# except :
#     print('Failed authentication')

# class Twitter(object):
#
#     # def __init__(self):
#
#     def search(self, query):
#         res = requests.get(query)

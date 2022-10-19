import csv

from bs4 import BeautifulSoup
# from selenium import webdriver
# from selenium.webdriver.chrome.service import Service
# from selenium.webdriver.chrome.options import Options
import requests
import pandas as pd

# path = "C:/Users/denab/funstuff/amazon stuff/chromedriver.exe"
# s = Service(path)
# driver = webdriver.Chrome(service=s)
headers = ({'User-Agent':
                'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36',
            'Accept-Language': 'en-US, en;q=0.5'})


class scraper(object):

    def __init__(self, headers):
        self.headers = headers

    def search(self, search_term):
        url = f"https://www.amazon.co.uk/s?k={search_term}"
        session = requests.Session()
        r = session.get(url, headers=self.headers)
        soup = BeautifulSoup(r.content, "html.parser")
        items = soup.find_all("div", attrs={"class": "sg-col-inner"})
        results = self.get_item_details(items)
        print(results)
        # self.save_to_csv(results)

    def get_item_details(self, items):
        results = set()
        for item in items:
            title = self.get_item_title(item)
            rating = self.get_item_rating(item)
            num_of_reviews = self.get_item_num_of_reviews(item)
            price = self.get_item_price(item)
            product_info = (title, rating, num_of_reviews, price)
            if title != "" and rating != "" and num_of_reviews != "" and price != "":
                results.add(product_info)
        return results

    def get_item_title(self, item):
        try:
            title = item.find("span", attrs={"class": "a-size-medium a-color-base a-text-normal"}).string
        except AttributeError:
            title = ""
        return title

    def get_item_rating(self, item):
        try:
            rating = item.find("span", attrs={"class": "a-icon-alt"}).string
        except AttributeError:
            rating = ""
        return rating

    def get_item_num_of_reviews(self, item):
        try:
            num_of_reviews = item.find("span", attrs={"class": "a-size-base s-underline-text"}).string
        except AttributeError:
            num_of_reviews = ""
        return num_of_reviews

    def get_item_price(self, item):
        try:
            price = item.find("span", attrs={"class": "a-offscreen"}).string
        except AttributeError:
            price = ""
        return price

    # def save_to_csv(self, data):
    #     with open("../results.csv", "w", newline="", encoding="utf-8") as f:
    #         writer = csv.writer(f)
    #     writer.writerow(["NAME", "RATING", "REVIEWS", "PRICE"])
    #     writer.writerows(data)
    ##


webscrape = scraper(headers)
webscrape.search("kirby and the forgotten land")

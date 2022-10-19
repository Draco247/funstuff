import csv

from bs4 import BeautifulSoup
import requests
import pandas as pd

headers = ({'User-Agent':
                'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36',
            'Accept-Language': 'en-US, en;q=0.5'})
base_url = "https://mhrise.kiranico.com/"


class Scraper(object):

    def __init__(self, headers, base_url):
        self.headers = headers
        self.base_url = base_url

    def get_all_weapon(self):
        weapon_ids = list(range(0, 14))
        for i in weapon_ids:
            url = f"{base_url}data/weapons?view={i}"
            session = requests.Session()
            r = session.get(url, headers=headers)
            soup = BeautifulSoup(r.content, "html.parser")
            # print(soup)
            print(self.get_all_item_details(soup, i))

    def get_all_item_details(self, soup, wpn_id):
        table = soup.find("table", attrs={
            "class": "min-w-full divide-y divide-slate-100 dark:divide-slate-400/10"})

        table_body = table.find('tbody')
        rows = table_body.find_all('tr')

        elementset = {"5": "Dragon", "2": "Water", "1": "Fire", "9": "Blast", "3": "Thunder", "4": "Ice", "7": "Sleep",
                      "6": "Poison",
                      "8": "Paralysis", }

        if wpn_id == 5:  # hunting horn section
            print("ok")
            # for row in rows:
            #     wpn_name = row.find('a')
            #     wpn_name = [ele.text.strip() for ele in wpn_name]
            #
            #     attack_val = row.find('div', attrs={"data-key": "attack"})
            #     attack_val = [ele.text.strip() for ele in attack_val]
            #
            #     element = row.find_all('img')[-1]['src']
            #     element_val = ""
            #
            #     if "Element" in element:
            #         element = elementset.get(element.split("Type", 1)[1].split(".png")[0])
            #         element_val = row.find('span', attrs={"data-key": "elementAttack"})
            #         element_val = [ele.text.strip() for ele in element_val]
            #     else:
            #         element = ""
            #
            #     songs = row.find_all('div', attrs={"class": "columns-3"})
            #     songs = [ele.text.strip() for ele in songs]
            #
            #     rarity = row.find_all('small')[-1]
            #     rarity_val = [ele.text.strip() for ele in rarity]
            #
            #     print(wpn_name, attack_val, element, element_val, songs, rarity_val)
            # print(data)

        if wpn_id == 7 or wpn_id == 8 or wpn_id == 9:  # gunlance/switch axe/charge blade section needs to have phial type and level
            print("ok")
            # for row in rows:
            #     wpn_name = row.find('a')
            #     wpn_name = [ele.text.strip() for ele in wpn_name]
            #
            #     attack_val = row.find('div', attrs={"data-key": "attack"})
            #     attack_val = [ele.text.strip() for ele in attack_val]
            #
            #     element = row.find_all('img')[-1]['src']
            #     element_val = ""
            #
            #     if "Element" in element:
            #         element = elementset.get(element.split("Type", 1)[1].split(".png")[0])
            #         element_val = row.find('span', attrs={"data-key": "elementAttack"})
            #         element_val = [ele.text.strip() for ele in element_val]
            #     else:
            #         element = ""
            #
            #     phial_type = row.find_all('div', attrs={"class": "columns-3"})
            #     phial_type = [ele.text.strip() for ele in phial_type]
            #
            #     rarity = row.find_all('small')[-1]
            #     rarity_val = [ele.text.strip() for ele in rarity]
            #
            #     print(wpn_name, attack_val, element, element_val, phial_type, rarity_val)

        if wpn_id == 10:  # insect glaive section needs to have kinsect level
            print("ok")
            # for row in rows:
            #     wpn_name = row.find('a')
            #     wpn_name = [ele.text.strip() for ele in wpn_name]
            #
            #     attack_val = row.find('div', attrs={"data-key": "attack"})
            #     attack_val = [ele.text.strip() for ele in attack_val]
            #
            #     element = row.find_all('img')[-1]['src']
            #     element_val = ""
            #
            #     if "Element" in element:
            #         element = elementset.get(element.split("Type", 1)[1].split(".png")[0])
            #         element_val = row.find('span', attrs={"data-key": "elementAttack"})
            #         element_val = [ele.text.strip() for ele in element_val]
            #     else:
            #         element = ""
            #
            #     kinsect_lvl = row.find_all('div', attrs={"class": "columns-3"})
            #     kinsect_lvl = [ele.text.strip() for ele in kinsect_lvl]
            #
            #     rarity = row.find_all('small')[-1]
            #     rarity_val = [ele.text.strip() for ele in rarity]
            #
            #     print(wpn_name, attack_val, element, element_val, kinsect_lvl, rarity_val)

        if wpn_id == 11:  # bow section
            for row in rows:
                wpn_name = row.find('a')
                wpn_name = wpn_name.text.strip()

                attack_val = row.find('div', attrs={"data-key": "attack"})
                attack_val = attack_val.text.strip()

                element = row.find_all('img')[-1]['src']
                element_val = ""

                if "Element" in element:
                    element = elementset.get(element.split("Type", 1)[1].split(".png")[0])
                    element_val = row.find('span', attrs={"data-key": "elementAttack"})
                    element_val = element_val.text.strip()
                else:
                    element = ""

                arc_shot = row.find_all('div', attrs={"class": "text-green-500"})[0]
                arc_shot = arc_shot.text.strip()

                arrow_lvl = row.find_all('small')[3]  # need to remove the arc shot part from the array
                arrow_lvl = [ele.text.strip() for ele in arrow_lvl]
                arrow_lvl = arrow_lvl[3:]
                # arrow_lvl = arrow_lvl[arrow_lvl.index()]

                bow_coatings = row.find_all('div', attrs={"class": "columns-3"})
                bow_coatings = [ele.text.strip() for ele in bow_coatings]

                rarity = row.find_all('small')[-1]
                rarity_val = rarity.text.strip()

                print(wpn_name, attack_val, element, element_val, arc_shot, arrow_lvl, bow_coatings, rarity_val)

        if wpn_id == 12 or wpn_id == 13:  # hbg and lbg section
            # print("ok")
            for row in rows:
                wpn_name = row.find('a')
                if wpn_name is not None:
                    wpn_name = [ele.text.strip() for ele in wpn_name]
                    print(wpn_name)

                attack_val = row.find('div', attrs={"data-key": "attack"})
                if attack_val is not None:
                    attack_val = [ele.text.strip() for ele in attack_val]

                table = row.find('table')
                ammo = []
                if table is not None:
                    gun_info = table.findAll('td')
                    for g in gun_info:
                        gun_info_info = g.find_all('div')
                        if len(gun_info_info) > 0:
                            drr = [gun_info_info[0].text.strip(), gun_info_info[1].text.strip(), gun_info_info[2].text.strip()]
                            # print(deviation[0])
                            print(drr)
                        ammo_info = g.find_all('table')

                        if len(ammo_info) > 0:
                            # print([ammo_info[0].text.strip().replace("\n", "")])
                            ammo += [ammo_info[0].text.strip().replace("\n", "")]
                            print(ammo)
                # deviation = gun_info.find_all('td')
                # print(gun_info)
                # print(deviation)
                # if deviation is not None:
                #     print([ele.text.strip() for ele in deviation])

                rarity = row.find_all('small')[-1]
                if rarity_val is not None:
                    rarity_val = [ele.text.strip() for ele in rarity]
                #
                print(wpn_name, attack_val,rarity_val)


webscrape = Scraper(headers, base_url)
webscrape.get_all_weapon()

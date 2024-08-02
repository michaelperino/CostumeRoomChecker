import requests
from bs4 import BeautifulSoup
# The lizard people won't tell you this, but you might also need html5lib and lxml installed. I'm unsure because
# Pandas made me do that when I was trying to do this earlier

# My pandas solution failed, but ChatGPT wrote the following:

DRESS_URL = 'https://oldschool.runescape.wiki/w/Mahogany_fancy_dress_box'
ARMOUR_URL = 'https://oldschool.runescape.wiki/w/Mahogany_armour_case'
CAPE_URL = 'https://oldschool.runescape.wiki/w/Magical_cape_rack'
WARDROBE_URL = 'https://oldschool.runescape.wiki/w/Marble_magic_wardrobe'
TOY_URL = 'https://oldschool.runescape.wiki/w/Mahogany_toy_box'
TREASURE_URL = 'https://oldschool.runescape.wiki/w/Mahogany_treasure_chest'

urls = [DRESS_URL, ARMOUR_URL, CAPE_URL, WARDROBE_URL, TOY_URL, TREASURE_URL]
with open('OUT_WIKI_LINKS.txt',"w") as f:
    for url in urls:
        f.write("\n\n")
        f.write(str(url))
        f.write("\n")
        html = requests.get(url).content
        #print(html)
        soup = BeautifulSoup(html,'html.parser')

        # Find all tables in the page
        tables = soup.find_all('table')

        # Filter out tables with the class "navbox"
        filtered_tables = [table for table in tables if 'navbox' not in table.get('class', []) and 'navbox-subgroup' not in table.get('class', [])]

        # Check if there are any filtered tables
        if not filtered_tables:
            raise ValueError("No tables found that do not have the class 'navbox'.")
        filtered_tables_2 = [filtered_tables[-1]]
        if url == TREASURE_URL:
            filtered_tables_2 = filtered_tables[-6:]
        for target_table in filtered_tables_2:
            # Get the last table from the filtered list

            # Extract hyperlinks from the second column of each row in the table
            rows = target_table.find_all('tr')
            for row in rows:
                columns = row.find_all('td')
                if len(columns) >= 2:
                    second_column = columns[1]
                    if url == TOY_URL:
                        second_column = columns[0]
                    links = [a['href'][3:] for a in second_column.find_all('a')]
                    for linky in links:
                        f.write(linky.upper().replace("%27", "").replace("(", "").replace(")", ""))
                        f.write("\n")


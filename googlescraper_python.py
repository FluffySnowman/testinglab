#build a google scraper which takes a search terms as an input in the terminal and prints the first 5 search results into the terminal


import requests
from bs4 import BeautifulSoup
import sys

#scrape google results for an input search term using bs4
def scrape_google_results(search_term):
    #get the html from google
    url = "https://www.google.com/search?q=" + search_term
    response = requests.get(url)
    html = response.text
    soup = BeautifulSoup(html, "html.parser")
    #find the first 5 results
    results = soup.find_all("div", class_="g")
    for result in results[:5]:
        #print the title and url of the result
        print(result.find("h3").text)
        print(result.find("a")["href"])
        print()

#main function
def main():
    #get the search term from the command line
    search_term = sys.argv[1]
    scrape_google_results(search_term)

if __name__ == "__main__":
    main()

    
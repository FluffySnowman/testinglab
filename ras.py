a = ["stations", "time"]

import datetime
from random import randrange


def random_date(start,l):
   current = start
   while l >= 0:
      curr = current + datetime.timedelta(minutes=randrange(60))
      yield curr
      l-=1

startDate = datetime.datetime.now()


stations_list = ["London        ", "Coventry", "Birmingham", "Northampton", "Nottingham"]




print(a[0] + "\t\t" + a[1])

aaa = 0

for i in random_date(startDate, 4):     
    print(stations_list[aaa] + "\t\t" + i.strftime("%Y-%m-%d %H:%M"))
    aaa = aaa + 1



        

""" 

for x in random_date(startDate,5):
print(i + "\t" + x.strftime("%d/%m/%y %H:%M"))

"""
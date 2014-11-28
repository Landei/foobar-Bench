#! /usr/bin/env python
#
# a little, very inaccurate benchmark tool
import time

__author__ = "Landei"
__email__ = "website@landei.pfweb.eu"
__version__ = "1.0"
__date__ = "28.11.2014"

eingabe = input("Input number range: ")
#int zahl, ziffer, ziffer2, eingabe
zahl = 0
t1 = time.time()
ziffer = zahl % 5
ziffer2 = zahl % 3

while zahl < eingabe:
    zahl = zahl + 1
    ziffer = zahl % 5
    ziffer2 = zahl % 3
    
    if (ziffer !=0) and (ziffer2 !=0):
        print(zahl)
    elif (ziffer == 0) and (ziffer2 == 0):
        print("foobar")
    elif (ziffer == 0):
        print("bar")
    elif (ziffer2 == 0):
        print("foo")

t2 = time.time()
timeEnd = (t2 - t1)

print "Time required: "+str(timeEnd)+" sek.\n"

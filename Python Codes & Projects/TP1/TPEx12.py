# -*- coding: utf-8 -*-
"""
Created on Tue Feb  8 09:24:35 2022

@author: Mohamed Aziz Karoui
"""

import numpy
import math

a = int(input('Donner le a'))
b = int(input('Donner le b'))
c = int(input('Donner le c'))


D = (b^2)-(4*a*c)

print(D)

if (D<0):
    print("l'équation n'admet pas de solution dans l'ensemble des nombres réels")
elif(D==0):
    print("la solution est unique est",-b/2*a)
elif(D>0):
    print("x1 est",((-1*b) - math.sqrt(D) )/(2*a))
    print("x2 est",((-1*b) + math.sqrt(D) )/(2*a))
    
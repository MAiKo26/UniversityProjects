# -*- coding: utf-8 -*-
"""
Created on Tue Feb  8 09:06:56 2022

@author: Mohamed Aziz Karoui
"""


h = input('Donner un nombre positive pour calculer son factorielle')

while (int(h)<0):
    h = input('Donner un nombre positive pour calculer son factorielle')



def fact(n):
    if n == 0: 
        return 1
    else:
        F = 1
        for k in range(2,n+1):
            F = F * k
            
        return F


    
print(fact(int(h)))
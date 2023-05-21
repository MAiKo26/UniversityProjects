# -*- coding: utf-8 -*-
"""
Created on Tue Feb  8 09:50:31 2022

@author: Mohamed Aziz Karoui
"""

S = 0
M = 0
nbr = 0

x = input("Donner le nombre suivant")

while (x != "="):
    S = S + int(x)
    nbr = nbr + 1
    M = S/nbr 


print(S)
print(nbr)
print(M)


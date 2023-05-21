# -*- coding: utf-8 -*-
"""
Created on Tue Feb  8 09:43:04 2022

@author: Mohamed Aziz Karoui
"""


mot = input('Donne la chaine mot')
x = input('donne le caractere a rechercher dans le mot')


def nombreOcurrences(x,mot):
    c = 0
    for i in range(len(mot)):
        if (mot[i] == x):
            c = c + 1
    return c


print("Le charactere ",x," se repete ",nombreOcurrences(x, mot)," fois dans la mot ",mot)
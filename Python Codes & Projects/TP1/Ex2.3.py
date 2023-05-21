# -*- coding: utf-8 -*-
"""
Created on Sat Feb 12 11:37:53 2022

@author: Mohamed Aziz Karoui
"""


file = open('pima-indians-diabetes.data.csv')

number_of_lines = 10

for row in range(number_of_lines):
    line=file.readline()
    print(line)


file.close()
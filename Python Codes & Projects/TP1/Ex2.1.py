# -*- coding: utf-8 -*-
"""
Created on Sat Feb 12 11:13:51 2022

@author: Mohamed Aziz Karoui
"""

import csv

file = open('pima-indians-diabetes.data.csv')

type(file)

csvreader = csv.reader(file)

header = next(csvreader)
print(header)
rows = []
for row in csvreader:
    rows.append(row)
print(rows)


file.close()
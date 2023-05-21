# -*- coding: utf-8 -*-
"""
Created on Sat Feb 12 11:55:53 2022

@author: Mohamed Aziz Karoui
"""



import csv
with open('pima-indians-diabetes.data.csv', newline='') as csvfile:
 data = csv.DictReader(csvfile)
 print("Les tensions artiliere des individus")
 print("---------------------------------")
 for row in data:
   print(row['BloodP'])
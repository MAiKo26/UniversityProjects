# -*- coding: utf-8 -*-
"""
Created on Thu Apr  7 15:21:40 2022

@author: Mohamed Aziz Karoui

"""


""" -1-

import csv

file = open('indian-liver-patients.csv')

type(file)

csvreader = csv.reader(file)

header = next(csvreader)
print(header)
rows = []
for row in csvreader:
    rows.append(row)
print(rows)


file.close()

"""
""" -2-

import pandas as pd
  
# read contents of csv file
file = pd.read_csv("indian-liver-patients.csv")
print("\nOriginal file:")
print(file)
  
# adding header
headerList = ['Age of Patient',
              'Gender of Patient',
              'Total Bilirubin',
              'Direct Bilirubin',
              'Alkphos',
              'Alkaline Phosphotase',
              'Sgpt Alamine Aminotransferase',
              'Sgot Aspartate Aminotransferase',
              'Albumin',
              'Albumin and Globulin Ration',
              'Liver Patient or not']


# converting data frame to csv
file.to_csv("indian-liver-patients.csv", header=headerList, index=False)
  
# display modified csv file
file2 = pd.read_csv("indian-liver-patients.csv")
print('\nModified file:')
print(file2)
"""


import pandas
from sklearn.preprocessing import MinMaxScaler
from sklearn.preprocessing import StandardScaler
dataframe = pandas.read_csv('indian-liver-patients.csv') 
array = dataframe.values
X = array[:,2:11]
scaler = StandardScaler().fit(X)
rescaledX = scaler.transform(X)
print(rescaledX)





scaler = MinMaxScaler(feature_range=(0,1))
rescaledX = scaler.fit_transform(X)

print(rescaledX)



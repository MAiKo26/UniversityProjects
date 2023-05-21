# -*- coding: utf-8 -*-
"""
Created on Sat Feb 12 11:20:56 2022

@author: Mohamed Aziz Karoui
"""


import pandas as pd
  
# read contents of csv file
file = pd.read_csv("pima-indians-diabetes.data.csv")
print("\nOriginal file:")
print(file)
  
# adding header
headerList = ['NumTimesPrg','PlGlcConc','BloodP','SkinThick','TwoHourSerIns','BMI','DiPedFunc','age','HasDiabetes']

# converting data frame to csv
file.to_csv("pima-indians-diabetes.data.csv", header=headerList, index=False)
  
# display modified csv file
file2 = pd.read_csv("pima-indians-diabetes.data.csv")
print('\nModified file:')
print(file2)

# -*- coding: utf-8 -*-
"""
Created on Tue Apr  5 08:12:06 2022

@author: Mohamed Aziz Karoui
"""

#Gérer les données manquantes 

import pandas
from sklearn.preprocessing import MinMaxScaler
from sklearn.preprocessing import StandardScaler

Columns = ['NumTimesPrg','PlGlcConc','BloodP','SkinThick','TwoHourSerIns','BMI','DiPedFunc','age','HasDiabetes']
dataframe = pandas.read_csv('pima-indians-diabetes.data.csv')
dataframe.columns = Columns
print(dataframe.values)
   
median_bmi = dataframe[dataframe['SkinThick']!=0].median()

dataframe['SkinThick'] = dataframe['SkinThick'].replace(0,median_bmi['SkinThick'])

# Il est impossible de faire la même avec NumTimesPrg care 0 est significatif et pas nulle
"""

#Standaritation

array = dataframe.values
X = array[:,0:7]

scaler = MinMaxScaler(feature_range=(0,1))
rescaledX = scaler.fit_transform(X)

print(rescaledX)


#Normalisation

scaler = StandardScaler().fit(X)
rescaledX = scaler.transform(X)

print(rescaledX)
  """
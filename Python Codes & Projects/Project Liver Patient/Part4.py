# -*- coding: utf-8 -*-
"""
Created on Thu Apr  7 17:14:13 2022

@author: Mohamed Aziz Karoui
"""

from sklearn.neural_network import MLPClassifier
from sklearn.model_selection import train_test_split
from sklearn import metrics
import pandas as pd
dataset = pd.read_csv("indian-liver-patients.csv")
Columns = ['Age of Patient',
              'Gender of Patient',
              'Total Bilirubin',
              'Direct Bilirubin',
              'Alkphos',
              'Alkaline Phosphotase',
              'Sgpt Alamine Aminotransferase',
              'Sgot Aspartate Aminotransferase',
              'Albumin',
              'Albumin and Globulin Ration',
              'LiverPatientornot']


dataset.columns=Columns
feature_cols1 = ['Age of Patient',
              'Total Bilirubin',
              'Direct Bilirubin',
              'Alkphos',
              'Alkaline Phosphotase',
              'Sgpt Alamine Aminotransferase',
              'Sgot Aspartate Aminotransferase',
              'Albumin',
              'Albumin and Globulin Ration',
              ]
feature_cols2 = [ 'Age of Patient']
feature_cols3 = [ 'Alkphos',
                 'Alkaline Phosphotase',
                 'Sgpt Alamine Aminotransferase',
                 'Sgot Aspartate Aminotransferase']
X = dataset[feature_cols3] 
y = dataset.LiverPatientornot 
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.25,random_state=0)
model = MLPClassifier(hidden_layer_sizes=150,activation='logistic',max_iter=1000)
model.fit(X_train, y_train)
y_pred = model.predict(X_test)

print("Accuracy:",metrics.accuracy_score(y_test, y_pred))
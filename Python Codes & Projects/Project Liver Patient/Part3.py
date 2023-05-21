# -*- coding: utf-8 -*-
"""
Created on Thu Apr  7 17:12:50 2022

@author: Mohamed Aziz Karoui
"""

import pandas as pd #data loading and manipulation
import matplotlib.pyplot as plt #plotting
import seaborn as sns #statistical plotting
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn import metrics
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
dataset.head()
dataset.info()
dataset.describe()

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
feature_cols2 = ['Age of Patient']

X = dataset[feature_cols2]
y = dataset.LiverPatientornot 
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.25,random_state=0)

logreg = LogisticRegression()

logreg.fit(X_train,y_train)

y_pred=logreg.predict(X_test)

print("y_pred= ", y_pred)

print("Accuracy:",metrics.accuracy_score(y_test, y_pred))

sns.regplot(x = "Age of Patient", y = "LiverPatientornot", data = dataset,logistic = True)

plt.show()
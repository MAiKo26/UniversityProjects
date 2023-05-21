# -*- coding: utf-8 -*-
"""
Created on Fri Apr 15 11:10:33 2022

@author: Mohamed Aziz Karoui
"""

import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt


df = pd.read_csv('indian-liver-patients.csv')


headerList = ['age',
              'gender',
              'tot_bilirubin',
              'direct_bilirubin',
              'alkphos',
              'tot_proteins',
              'sgpt',
              'sgot',
              'albumin',
              'ag_ratio',
              'is_patient']


# converting data frame to csv
df.to_csv("indian-liver-patients.csv", header=headerList, index=False)


df.head()

df.drop('age',axis=1,inplace=True)

df.drop('gender',axis=1,inplace=True)

df.head()

from sklearn.preprocessing import StandardScaler

scaler = StandardScaler()

scaled_values = scaler.fit(df.drop('is_patient',axis=1))
scaled_values =scaler.transform(df.drop('is_patient',axis=1))

df2 = pd.DataFrame(scaled_values,columns=df.columns[:-1])

df2.head()


sns.pairplot(data=df,hue='is_patient')




from sklearn.neighbors import KNeighborsClassifier

knn = KNeighborsClassifier()

from sklearn.model_selection import train_test_split

X= df2
X = X.replace((np.inf, -np.inf, np.nan), 0).reset_index(drop=True)
y=df['is_patient']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.33)




error_rate = []
for i in range(1,40):
    
   knn = KNeighborsClassifier(n_neighbors=i)
   knn.fit(X_train,y_train)
   pred = knn.predict(X_test)
   error_rate.append(np.mean(y_test != pred))




plt.figure(figsize=(10,6))
sns.set(style="whitegrid")
plt.plot(range(1,40),error_rate,color='green', linestyle='dashed', marker='o',
         markerfacecolor='red', markersize=10)
plt.title('Error Rate vs. K Value')
plt.xlabel('K')
plt.ylabel('Error Rate')



#at K = 33
from sklearn.metrics import classification_report

knn2= KNeighborsClassifier(n_neighbors=33)
knn2.fit(X_train,y_train)
pred2 = knn2.predict(X_test)
print(classification_report(y_test,pred))

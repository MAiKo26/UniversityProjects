# -*- coding: utf-8 -*-
"""
Created on Thu Apr  7 16:39:41 2022

@author: Mohamed Aziz Karoui
"""

import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

dataset = pd.read_csv('indian-liver-patients.csv')

print('Size of Dataset is ',dataset.shape)

# Total Bilirubin vs Direct Bilirubin

dataset.plot(x='Total Bilirubin',y='Direct Bilirubin',style='o')

plt.title('Total Bilirubin vs Direct Bilirubin')
plt.xlabel('Total Bilirubin')
plt.ylabel('Direct Bilirubin')
plt.show()

x = dataset['Total Bilirubin'].values.reshape(-1,1)
y = dataset['Direct Bilirubin'].values.reshape(-1,1)

x_train, x_test, y_train, y_test = train_test_split(x,y,test_size=0.2)

regressor = LinearRegression()
regressor.fit(x_train,y_train)


print('A: ', regressor.intercept_)
print('B: ',regressor.coef_)

r_sq = regressor.score(x_train,y_train)
print('Coef: ',r_sq)

y_pred = regressor.predict(x_test)

plt.scatter(x_test,y_test,color='gray')
plt.plot(x_test,y_pred,color='red',linewidth=2)
plt.show()

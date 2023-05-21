from math import *
import numpy as np

A=[[4,6,-2,3],[2,-1,0,1],[-7,0,1,12]] ;

i = 0;


print(A[0][0]," ",A[0][1]," ",A[1][0])

for i in range(3):
    A[0][i]=A[0][i]*2;
    A[1][i]=A[1][i]*2;
    A[2][i]=A[2][i]/3;
    


print(A);


B=np.array([np.arange(4,7,1),np.arange(5,16,5),np.ones((3,),dtype=int)]);

print(B) ;




C=[[0,0,0],[0,0,0],[0,0,0]];

i = 0 ;
j = 1;

while i < 3:
    while j < 4:
        C[0][j-1]=A[i][j];
        j=j+1;
    j=0;
    i = i+1;

print(C);


D = np.dot(B,A)

print(D)


E = np.dot(B,C)

print(E)

S = 0
for i in range(2):
    for j in range(2):
        S= S+ E[i][j]


print(S)

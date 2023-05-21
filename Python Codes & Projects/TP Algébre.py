from math import *
import numpy as np
from numpy.linalg import eig
from sympy import *



M= np.matrix([[1,2,1],
             [1,2,1],
             [-1,-2,-1]])


M2 = M * M

print("M**2 est ",M2)

M3 = M * M * M

print("M**3 est ",M3)


M4 = M * M * M * M

print("M**4 est ",M4)

M5 = M * M * M * M * M

print("M**5 est ",M5)


def PuissanceMatrice(M,n):
    H = 1;
    for i in range(n):
        H = H * M
    print("M**",n," est ",H);



A =[1,
    -1,
    0];

B=[[2,1,0],[1,2,1],[0,2,1]] ;

x = np.linalg.solve(B,A) ;

print("La résolution du systéme est ",x);




A = np.matrix([[1,2,3],
               [4,5,6],
               [7,8,1]])


eigval, eigvec = eig(A)



P = np.mat(eigvec)
D = np.diag(eigval)


print('les valeurs propres sont',P)
print('Les vecteurs propres sont',D)



print("La diagonalisation de A est ",P * D * P.I)



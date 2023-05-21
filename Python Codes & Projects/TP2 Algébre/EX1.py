import numpy as np
from numpy.linalg import eig
from sympy import *



A = np.matrix([[1,1,1,1],
               [1,1,1,1],
               [1,1,1,1],
               [1,1,1,1]])

B = Matrix([[1,1,1,1],
            [1,1,1,1],
            [1,1,1,1],
            [1,1,1,1]])

eigval, eigvec = eig(A)



P = np.mat(eigvec)
D = np.diag(eigval)

P1,D1 = B.diagonalize()

print('les valeurs propres grace a numpy.linalg sont ',P)
print('La matrice de vecteur propres grace a numpy.linalg est ',D)


print('Les valeurs propres grace a sympy sont ',B.eigenvals())
print('La matrice de vecteur propre grace a sympy est ',B.eigenvects())


print(P * D * P.I)
print(P1 * D1* P1**-1 == B)

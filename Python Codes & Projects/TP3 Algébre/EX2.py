
from sympy import *


A = Matrix([[1,-2,-3],
            [2,-4,-6],
            [-1,2,3]])



print('Les valeurs propres de A sont ',A.eigenvals())
print('La matrice de vecteur propre de A est ',A.eigenvects())



P, J = A.jordan_form()
pprint(P)


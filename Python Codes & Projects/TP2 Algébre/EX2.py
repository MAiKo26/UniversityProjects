from sympy import *


M = Matrix([[1,1,1,1],
            [1,1,1,1],
            [1,1,1,1],
            [1,1,1,1]])




print('Les valeurs propres grace a sympy sont ',M.eigenvals())
print('La matrice de vecteur propre grace a sympy est ',M.eigenvects())



P,D = M.diagonalize()



print(P * D * P**-1)

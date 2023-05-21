from sympy import *


A = Matrix([[-1,-4],[1,3]])


P, J = A.jordan_form()
print(P)
print(J)
print(P**-1)

print(P*J*P**-1==A)


"""
P,D = A.diagonalize()



print(P * D * P**-1)
"""

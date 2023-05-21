from math import *


A=[[3,5,1],[9,5,7],[9,8,7]]

def construire(A):
    nl = len(A)
    nc = len(A[0])
    T = [0]*(nl-1)
    for i in range(nl-1):
        nb = 0
        for j in range(nc):
            if A[i][j] not in A[i+1]:
                nb = nb + 1
        T[i] = nb
    return T


print(construire(A))

from math import *
import numpy as np

A=[[1,-1,2,1,2],[-1,2,3,-4,1],[0,-1,1,0,0]] ;


x=np.linalg.matrix_rank(A)

print("le rang de A est ",x)



A = np.delete(A,3,1)
A = np.delete(A,3,1)

B =[3,
    -7,
    1]


print(A);


x = np.linalg.solve(A,B)


print(x)

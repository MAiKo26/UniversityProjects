from math import *
import numpy as np


A=[[4,5,6,-1],[5,10,15,2],[6,15,1,4],[-1,2,4,-2]] ;

x,y= np.linalg.eig(A)
print(x)


B = np.linalg.inv(A)


print(B)

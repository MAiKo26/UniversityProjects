from math import *

import numpy as np



x = int(input("donne x "))

n = int(input("donne n "))

E = 0

i = 0

def factorielle(h):
    if h==0:
        return 1
    else:
        return h * factorielle(h-1)


for i in range(n):
    E = E + (x**(i)/factorielle(i))



print("Exp(e) = ",np.exp(x)," alors que notre programem donne ",E)



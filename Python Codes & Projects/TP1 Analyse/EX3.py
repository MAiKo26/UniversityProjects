from math import *
import numpy as np
import matplotlib.pyplot as plt




n = int(input("donne n "))



S = 0
x = np.linspace(0,n,n)

for k in range(n):
        S = S + (1/(2**(k))+(x**k))
        print("S est ",S)
        print("K EST ",k)
        print(x)

plt.plot(S,x)    
plt.show()





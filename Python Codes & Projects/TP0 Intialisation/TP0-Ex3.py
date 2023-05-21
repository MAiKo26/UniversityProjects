from math import *
import matplotlib.pyplot as plt
import numpy as np


x = np.linspace(1,2,4,9)

y = sum((1/(2**k))*(x**k) for k in range(10))
    
plt.plot(y,x)


plt.show()
 

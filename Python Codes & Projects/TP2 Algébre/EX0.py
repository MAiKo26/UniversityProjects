
""" Part 1 """

import numpy as np
from numpy.linalg import eig


A = np.matrix('2 1;1 2')
eigval, eigvec = eig(A)

P = np.mat(eigvec)
D = np.diag(eigval)

print(P * D * P.I)

""" Part 2 """

from sympy import *
M= Matrix([[3,-2,4,-2],
            [5,3,-3,-2],
            [5,-2,2,-2],
            [5,-2,-3,3]])

print(M.eigenvals())
print(M.eigenvects())


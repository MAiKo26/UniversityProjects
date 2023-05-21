import cmath
import sympy
from sympy import *


def fact(n):
   if n == 0:
      return 1
   else:
      F = 1
      for k in range(2,n+1):
         F = F * k

      return F



F = 0


n = 1
while (n<99):
    F = F + (1**(3*n))/(fact(3*n)) ;
    n = n +1 ;



print(F)

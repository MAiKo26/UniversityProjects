import cmath
import sympy
from sympy import *

x = symbols('x')


print(limit(((sin(x)-x)/x**3),x,0))

print(limit((2*x+1),x,5/2))

print(limit((1/(5+2*x)**2),x,+oo))

print(limit((x**3+2*x**2-1),x,+oo))

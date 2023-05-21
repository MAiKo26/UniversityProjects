import cmath
import sympy
from sympy import *
import matplotlib.pyplot as plt
import numpy as np


A1 = 4*(-2+3j)+3*(-5-8j)
A2 = (((3+5j)**2)/(1-2j))
A3 = ((1+1j)/(2-1j))**2+((3+6j)/(3-4j))
A4 = 1+1j*cmath.sqrt(3)

print ("La Partie réele de A1 est ",A1.real);
print ("La Partie réele de A2 est ",A2.real);
print ("La Partie réele de A3 est ",A3.real);
print ("La Partie réele de A4 est ",A4.real);


print ("La Partie Imaginaire de A1 est ",A1.imag);
print ("La Partie Imaginaire de A2 est ",A2.imag);
print ("La Partie Imaginaire de A3 est ",A3.imag);
print ("La Partie Imaginaire de A4 est ",A4.imag);

print ("La Partie Conjugé de A1 est ",A1.conjugate());
print ("La Partie Conjugé de A2 est ",A2.conjugate());
print ("La Partie Conjugé de A3 est ",A3.conjugate());
print ("La Partie Conjugé de A4 est ",A4.conjugate());




def fact(n):
   if n == 0:
      return 1
   else:
      F = 1
      for k in range(2,n+1):
         F = F * k

      return F


x = np.linspace(-3.14,3.14,5) ;

F = 0 ;
k = 0 ;

while (k<99):
    F = F + (x**k)/(fact(x.all())) ;
    k = k +1 ;


plt.plot(F,x)    ;
plt.show() ;



x = symbols('x');


G1 = (-2*x)+1
G2 = x+1
G3 = x**2 + 2

print(limit(G3,x,+4));
print(limit(G1,x,-0));
print(limit(G2,x,1));
print(limit((-x+(pi/(x**2))+3*x+2),x,+oo));
print(limit(x**(1/x),x,+oo));
print(limit(((1-cos(x)**2)/(sin(x))),x,pi));





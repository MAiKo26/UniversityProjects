import cmath
import sympy
from sympy import *


x = int(input("donne x"));

F = 0

G = 0

n = 1
while (n<99):
    F = F+ (x**n)/((2*n)+1) ;
    n = n +1 ;


n = 1

while (n < 99):
    G = G +((x**n)/n) ;
    n = n +1 ;



print(F+G)

K = 0

n = 1

while (n<99):
    K = K + ((1/n)+(1/(2*n+1))*(x**n)) ;
    n = n + 1 ;


print(K)

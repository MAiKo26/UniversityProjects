from math import *



n = input("donne n ")


S = 0

for k in range(int(n)):
        S = S + 1/(k+1)


print("La somme partielle de la série est ", S)


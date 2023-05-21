from math import *
 
N = 6 ;

K = 6 ;



T = [11,3,4,7,9,13] ;

for i in range(N):
    print("Voila le tableau avant : ",T[i]);

    

def deplacer(T,K):
    i = 0 ;
    while i < N:
        if T[i] > K:
            h = T[i]
            j = i
            for j in range(N-1):
                y = T[j+1] 
                T[j]= y
            T[N-1]= h ;
            i = i - 1 ;
            break
            i = i + 1 ;
        


deplacer(T,K)

for i in range(N):
    print("Voila le tableau aprés : ",T[i]);
            


from math import *




n = 3

m = 5

A = [[5,15,34,21,11],
     [3,11,75,3,56],
     [19,30,24,95,99]]







def trier(A):
    i=0;
    print("0")
    while i < n-1:
        j=0;
        print("i = ",i,"j = ",j)
        while j < m:
            print("i = ",i,"j = ",j)
            if A[i][j] < A[i+1][j]:
                print("3")
                print("switch : ",A[i][j], A[i+1][j])
                A[i][j],A[i+1][j]= A[i+1][j],A[i][j] ;
                i = 0 ;
                j = 0 ;
            j = j + 1 ;
        if i < n-1:
            i = i + 1 ;





trier(A)

i=0

for i in range (n):
    j=0
    print('ROW',i)
    for j in range(m):
        print(j,'COL')
        print(A[i][j])

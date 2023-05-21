A = [2 1 3;4 6 10;10 3 1] ;
B = [6 20 14] ;
n = 3 ;
L=eye(n);


for k = (1:n-1)
    for i = (k+1:n)
       L(i,k)=A(i,k)/A(k,k);
        for j = (k+1:n)
            A(i,j) = A(i,j) - L(i,k) * A(k,j);
        end
        
    end
    
end
A
L
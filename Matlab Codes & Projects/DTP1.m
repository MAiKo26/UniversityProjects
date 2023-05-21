A = [1 1 2;2 3 1;3 -1 -1] 
B = [3;2;6] 
n = 3 ;
X = [0 0 0]


for k = (1:n-1)
    for i = (k+1:n)
        m = A(i,k)/A(k,k) ;
        B(i) = B(i) - m*B(k);
        for j = (k:n)
            A(i,j) = A(i,j) - m * A(k,j) ;
        end
        
    end
    
end



X(n)= B(n)/A(n,n);

n = 3 ;

for p = (n-1:-1:1)
    for g = (p+1:n)
        B(p)= B(p)-A(p,g)*X(g);
    end
    X(p)= B(p)/A(p,p) ;
end

X
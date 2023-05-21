x0 = [0;0;0] ;
ep = 0.01 ;

A = [2 -1 0;-1 2 -1;0 -1 2] ;
B = [0;1;0] ;
k = 1 ;
n = 3 ;
nmax = 20 ;


for (niter = 1:nmax)
    for i = 1:n
        S = A(i,[1:i-1,i+1:n])*x0([1:i-1,i+1:n]) ;
        x(i)= (B(i) - S) / A(i,i) ;
    end
    if norm (x-x0)< ep
        break ;
    end
    x
    x0 = x ;
    k = k + 1  
end

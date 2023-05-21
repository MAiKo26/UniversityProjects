x0 = [0;0;0] ;
ep = 0.01 ;

A = [2 -1 0;-1 2 -1;0 -1 2] ;
b = [0;1;0] ;
nmax = 20 ;
n = 3 ;
x = x0 ;
k = 0 ;


for (niter = 1:nmax) 
    n = 3 ;
    i = 0 ;
    for i = (1:n)
        S1 = A(i,1:i-1) * x(1:i-1) ;
        S2 = A(i,i+1:n) * x0(i+1:n) ;
        x(i) = (1/(A(i,i))) * (b(i)-S1-S2);
       
    end
    if (norm(x-x0) < ep) 
        break ;
    end
    x
    x0 = x ;
    k = k + 1 
end


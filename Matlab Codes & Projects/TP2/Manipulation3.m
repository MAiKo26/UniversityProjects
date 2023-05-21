a = [1 2 3 4;2 5 1 10;3 1 35 5;4 10 5 45] ;
b = [0; -12; 59; -43] ;
x = [0; 0; 0; 0] ;
l = [0; 0; 0; 0] ;
n = 4 ;

for i = (1:n)
    
    h = 0 ;
    for k = (1:i-1)
        h = h + ((l(i,k))^2) ;
    end
    
    l(i,i) = sqrt(a(i,i)-h) ;
    
    for j = (i+1:n)
    
        h = 0 ;
        for k = (1:i-1)
            h = h + (l(j,k)*l(i,k)) ;    
        end
        
        l(j,i) = (a(j,i)-h)/l(i,i) ;
    
    end
end



for i = (1:n)
    
    h = 0 ;
    for k = (1:i-1)
        h = h + l(i,k)*y(k) ;
    end
    
    y(i)=(b(i)- h)/l(i,i) ;
    
    for j = (n:-1:1)
        
        h = 0;
        for k = (i+1:n)
             h = h + l(k,i)*x(k) ;
        end
        x(i) = (y(i) - h)/l(i,i) ;
    end
end

a
b
l
x

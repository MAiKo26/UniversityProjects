x = 0 ;
i = 0 ;
j = 0 ;
C = [0 0 0 0;0 0 0 0;0 0 0 0;0 0 0 0]
for i = (1:4)
    y = x ;
    for j = (1:4)
        y = y + 1 ;
        C(i,j) = y ; 
    end
    x = x + 1 ;
end


close all ; clear all ; clc ;


ExamanTPP1_1 ;


for i=3:12
    if i==3
        IM1 = medfilt2(IG, [3 3]) ;
        figure , imshow(IM1) ;
    end
    if i==5
        IM2 = medfilt2(IG, [5 5]) ;
        figure , imshow(IM2) ;
    end
    if i==7
        IM3 = medfilt2(IG, [7 7]) ;
        figure , imshow(IM3) ;
    end
    if i==11
        IM4 = medfilt2(IG, [11 11]) ;
        figure , imshow(IM4) ;
    end
end
   
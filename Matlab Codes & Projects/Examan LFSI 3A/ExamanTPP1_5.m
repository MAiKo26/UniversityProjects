close all ; clear all ; clc ;

ExamanTPP1_1 ;

%5 
IR = IG ;
c = 20 ;
for i=1:18
 IR1 = imrotate(IR,c) ;
 figure , imshow(IR1) ;
 c= c + 20 ;
end


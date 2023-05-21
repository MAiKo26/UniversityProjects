close all;
clear ;
clc ;

x = -4:0.5:4 ;




y=-2*(x.^3)+x.^2-2*x+4 ;



figure(1);
plot(x,y,'r')

title('Variation de y sur intervalle -4 4 avec 0.5 pas')
xlabel('axes des x')
ylabel('axes des y')
grid

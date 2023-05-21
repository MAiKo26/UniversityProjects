close all;
clear ;
clc ;
x=-2*pi:0.05:2*pi;
f=sin(pi/4*x);
g=cos(pi/4*x);
figure(1);
plot(x,f,'r')
hold
plot(x,g,'b')
legend('Sin(x)','Cos(x)')
title('Variation de Sinus et Cosinus')
xlabel('axes des x')
ylabel('axes des y')
grid

clear all;
clc;
t= [0:pi/100:2*pi];
y=sin(0.3*pi*t)
plot(t,y,'+r')
grid
title ('le graphe de la fonction y(t)') 
xlabel('fct de temps t')
ylabel('fct y')

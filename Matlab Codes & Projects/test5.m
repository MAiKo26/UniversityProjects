clear all;
close all;
clc
t= [0 : pi/100 : 2*pi] ;
y=sin (0.3*pi*t) ;
y1=cos(0.3*pi*t);
figure(1)
plot(t, y)
grid
title('le graphe de la fonction y(t)')
xlabel('le temps t')
ylabel('la fonction y')
figure(2)
plot(t, y1)
grid
title('le graphe de la fonction y1(t)')
xlabel('le temps t')
ylabel('la fonction y1')
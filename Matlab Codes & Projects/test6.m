clear all;
clc
t= [0 : pi/100 : 2*pi] ;
y=sin (0.3*pi*t) ;
y1=cos(0.3*pi*t);
plot(t, y)
grid
hold
plot(t, y1,'r')
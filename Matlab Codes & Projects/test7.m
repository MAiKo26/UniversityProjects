clear all;
close all ;
clc
t= [0: pi/100: 2*pi];
y=sin (0.3*pi*t) ;
y1=cos (0.3*pi*t);
y2=sin (0.3*pi*t)+cos (0.3*pi*t);
y3=sin (0.3*pi*t)-cos (0.3*pi*t);
subplot(2,2,1);plot(t, y)
grid
subplot(2,2,2);plot(t, y1)
grid
subplot(2,2,3);plot(t, y2)
grid
subplot(2,2,4);plot(t, y3)
grid
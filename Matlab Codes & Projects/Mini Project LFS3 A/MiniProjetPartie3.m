clc
clear all ;
close all ;

x=-4*pi:0.5:4*pi ;

f=exp(x+0.5) ;
g=exp(x-0.5) ;
h=exp(x+1) ;
figure;
plot(f,'r');
grid
hold
plot(g,'y');
plot(h,'b');


figure;
subplot(1,3,1);
plot(f,'r');
subplot(1,3,2);
plot(g,'y');
subplot(1,3,3);
plot(h,'b');


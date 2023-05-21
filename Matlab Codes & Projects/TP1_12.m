clear all ;
clc ;
close all ;



Ts=100;
Duree=200;
Te=1;
N=Duree/Te;
n=0:N;
t=n*Te;
x=sin(2*pi*t/Ts);


plot(x);


'Fréquence échantillage est'

Fe= 1/Te


Y = fft(x)

plot(abs(Y))



B =0.4;
bruit=B*randn(1,N+1)
yb=x+bruit;


subplot(3,1,1)

plot(x)
subplot(3,1,2)
plot(abs(Y))

subplot(3,1,3)
plot(yb)

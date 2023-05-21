clear all; close all;
Fe = 4000;h = 1/Fe;
f0 = 440; T = 1.5;

th = 0:h:T;
s = sin(2*pi*f0*th);
figure(1), plot(th(1:30),s(1:30))

sound(s,Fe)

wavwrite(s, Fe, './sinus.wav');
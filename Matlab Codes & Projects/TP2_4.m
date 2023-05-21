% arpège de sons sinusoïdaux (Matlab)
clear all; close all;
Fe = 4000;h = 1/Fe;% selon le théoreme de shanon Fechantillo&gt;=2fsinalmax--&gt;fsinalmax=4*f0
f0 = 440; T = 1.5;
% création du signal onde
th = 0:h:T;
s = 1*sin(2*pi*f0*th)+0.5*sin(4*pi*f0*th)+0.5*sin(2*pi*3*f0*th)+0.5*sin(2*pi*4*f0*th);
figure(1), plot(s(1:50))
grid on
%wavplay(x, Fe);
sound(s,Fe)
wavwrite(s, Fe, './sinus.wav');
%***************************spectre************
%*************calcul du transformé de fourrier
y=s;
Yfft=fft(y);
sp=abs(Yfft);% Calcul du module de la fft du signal
%***************% tracé du spectre d’amplitude entre [0;fe/2]
%*******définiir l&#39;axe des fréquences
Te= 1/Fe;
fe=1/Te;
N=length(y);
fr= 0:(fe/N):(fe/2-fe/N);% determiner l’axe des fréquences-
figure(3),plot(fr,sp(1:(N/2)))
grid on
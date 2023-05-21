clc ;
close all ;
clear all ;


f0=1;
A=1;
n=25;
dt=1/(50*n*f0);
t=(0:dt:8/f0);
A0=A/2;
e=A0;
B=0.16;
bruit=B*randn(size(t));
for i=1:n
 an=A*sinc(i/2);
 xn=an*cos(2*pi*f0*i*t);
 e=xn+e;
end
e=e+bruit; 
figure(1)
subplot(2,1,1) ;plot(t,e) ;xlabel('temps') ;ylabel('e(t)') ; title('signal d’entrée du filtre ') ;

fn=1/(2*dt) ; %Moitié de la fréquence d’échantillonnage = fréquence de Nyquist
fc=input('entrer la fréquence de coupure du ffiltre') ;
ordre=input('entrer l’’ordre du filtre ') ;
[CB,CA]=butter(ordre,fc/fn); % Détermination du coef du filtre numérique correspondant au passe bas d’ordre n et de fréquence de coupure fc.
[H,f]=freqz(CB,CA,15000,1/dt); % Obtention du gabarit du filtre H et fréquences associées
figure(2)
semilogx(f,20*log10(abs(H))) % Tracé du gabarit du filtre
axis([0.1 10*fc -120 0]) ; grid ; title('gabarit du filtre Butterworth');
xlabel('fréquence'); ylabel('Gain en dB');
ef=filter(CB,CA,e); % Filtrage du signal d’entrée e avec le filtre passe bas
figure(1) ; subplot(2,1,2) ; plot(t,ef)%Tracé du signal filtré
title('signal filtré') ; xlabel('temps') ; ylabel('signal filtré');
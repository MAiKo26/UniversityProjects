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
subplot(2,1,1) ;plot(t,e) ;xlabel('temps') ;ylabel('e(t)') ; title('signal d�entr�e du filtre ') ;

fn=1/(2*dt) ; %Moiti� de la fr�quence d��chantillonnage = fr�quence de Nyquist
fc=input('entrer la fr�quence de coupure du ffiltre') ;
ordre=input('entrer l��ordre du filtre ') ;
[CB,CA]=butter(ordre,fc/fn); % D�termination du coef du filtre num�rique correspondant au passe bas d�ordre n et de fr�quence de coupure fc.
[H,f]=freqz(CB,CA,15000,1/dt); % Obtention du gabarit du filtre H et fr�quences associ�es
figure(2)
semilogx(f,20*log10(abs(H))) % Trac� du gabarit du filtre
axis([0.1 10*fc -120 0]) ; grid ; title('gabarit du filtre Butterworth');
xlabel('fr�quence'); ylabel('Gain en dB');
ef=filter(CB,CA,e); % Filtrage du signal d�entr�e e avec le filtre passe bas
figure(1) ; subplot(2,1,2) ; plot(t,ef)%Trac� du signal filtr�
title('signal filtr�') ; xlabel('temps') ; ylabel('signal filtr�');
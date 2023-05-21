clear all ;
clc ;
close all ;


n=input('Entrer le norme de coefficients n pour la synthese');
f0=1 ; % fr�quence fondamentale
A=1 ;
dt=1./(50*n*f0); % Incr�ment temporel
t=(0 :dt : 2/f0); % cr�ation du temps sur 2 p�riodes du signal par Incr�ment de t
A0=A/2 ; % Valeur moyenne du signal
e=A0 ;
for i=1 :n % Calcul des coefficients de fourrier an et bn
 an=A*sinc(i/2) ;
 bn=0;
 xn=an*cos(2*pi*f0*i*t)+bn*sin(2*pi*f0*i*t);
 e=xn+e;
end

plot(e);
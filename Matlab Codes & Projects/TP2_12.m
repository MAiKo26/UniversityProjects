clear all; close all;
y=audioread('guitar.wav') ;
figure(1), plot(y)% afficher le signal
%sound(y,44100)
N=length(y);
%**********************
%s’agit d’un son mono ou stéréo///mono car un seul colonne
%pour les autres tapez --> ""info=audioinfo('guitar.wav')""
% La fréquence d’échantillonnage --> 
%La durée de ce signal audio (en millisecondes)
%Le nombre de bits de stockage des données.--> le type double occupe 8
%octets pour une valeur -->utilisez whos y
%*******************************************
y2=y(1 :2 :N) ;
figure(2), plot(y2)% afficher le signal
sound(y2,44100/2) ;
N2=length(y2);
%**********************************
%***************calcul fourier et affichage spectre
 
fe=44100;
z = fft(y);
zaa=floor(abs(z));%Calcul fft et module
fr= 0:(fe/N):(fe-fe/N);% determiner l’axe des fréquences-
figure(3),plot(fr,zaa(1:(N)))
grid on
%********on commence par trier les modules de la transform´ee de Fourier z de y et
%l'afficher
zs=sort(zaa) ;
figure(5), plot(zs)
%on cherche la valeur du seuil "s" en fonction du facteur de compression r
s=zs(round(N*(1-1/5)) ) ;
%On met à 0 les valeurs inférieures au seuil s et afficher le résultat:
z2=z;
z2(zaa<s)=0 ;
figure(6), plot(fr,abs(z2))
%il conviendrait maintenant de ne stocker que les coefficients non nuls. Un %fichier mp3 contient dont des informations de nature fr´equentielles.
 
j=1;
for i=1:N-1
    if abs(z2(i))~=0
  zv(j) = (z2(i));  
   j=j+1;
   end
end
 mmm=zv';
 n = j-1 ;
f1=0 :(fe/n):fe-(fe/n) ;
figure(7), plot(f1(1 :n),abs(mmm(1 :n)))
y_inv=(ifft((mmm))) ;
figure(8), plot(real(y_inv))
 
pause;
sound(real(y_inv),44100)

clc ;
clear all ;
close all ;

[x,fs]=audioread('Uchiha.wav');
sound(x,fs);
[N,p]= size(x) ;
y=dir('Uchiha.wav');

disp ('La taille du fichier en octet est') ;
disp (y.bytes) ;
disp ('Le Nombre d�chantillage est');
disp(N) ;
disp ('Le fr�quence d�chantillage est');
disp(fs) ;

son_inv=flipud(x);
extrait=son_inv(100:500);
figure;
plot(extrait);


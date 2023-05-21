clc;
clear;
close all;
I = imread('eight.tif');
figure
imshow(I) % afficher l'image avec 256 niveaux de gris
n=50;% choisir le nombre de niveaux de gris
d=255/n-1; %déterminer le pas de quantification
J= floor(I/d);
 figure, imagesc(J), colormap(gray)
figure, imhist(J)

clc
clear all ;
close all ;

OP = imread('OP.jpg') ;
imshow ('OP.jpg');

disp('La taille de L image est');
disp(size(OP));


R= OP; G=OP ; B=OP;

R(:,:,[2 3]) = 0;
G(:,:,[1 3]) = 0;
B(:,:,[1 2]) = 0;

figure;
subplot(3,1,1);
imshow(R);
subplot(3,1,2);
imshow(G);
subplot(3,1,3);
imshow(B);


BC= OP ;
[rows, columns , numberOfColorChannels] = size(BC) ;
midRow = floor(rows/2);
BC(1:midRow, :, :) = 255;
figure;
imshow(BC);
clc;
clear;
close all;


I = imread('rice.png');
J = imresize(I, 0.5);
figure, imshow(I)
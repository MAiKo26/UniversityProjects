clear all;
clc;
I = imread ('x.jpg') ; 
I(1:3,31:50) = 0;
I(2,3)
figure, imshow(I);

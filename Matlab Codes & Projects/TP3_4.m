clear all;
clc;
I = imread ('x.jpg'); r= I; g= I; b= I; 

r(:,:,[2 3]) = 0;
g(:,:,[1 3]) = 0;
b(:,:,[1 2]) = 0;

subplot(1,4,1), imshow(I);
subplot(1,4,2), imshow(r);
subplot(1,4,3), imshow(g);
subplot(1,4,4), imshow(b);



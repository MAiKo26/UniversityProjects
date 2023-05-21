clc;
clear;
close all;
I = imread('lena.jpg');
figure ,
imshow(I) ;

[n,p]=size(I);

for i= 1:n
    for j= 1:p
       N(i,j)=255-I(i,j);
    end
end

figure, imshow(N) ;
close all ; clear all ; clc ;

% Ouvrir une image
I = imread('fleur.jpeg') ;
I = rgb2gray(I) ;

% Filtre Moyenneur
N = ones(3)/9 ;
if1 = imfilter(I,N) ;

% Filtre Gaussien
IB = imgaussfilt(I,2) ;

% Gradient Robert
filtered_image = zeros(size(I)) ;
Hx = [-1 0; 1 0] ;
Hy = [0 -1 ; 0 1] ;
for i = 1:size(I,1) - 1
    for j = 1:size(I,2) - 1
        Gx = sum(sum(Hx.*I(i:i+1, j:j+1)));
        Gy = sum(sum(Hy.*I(i:i+1, j:j+1)));     
        filtered_image(i,j) = sqrt(Gx.^2 + Gy.^2) ;
    end
end
figure, imshow(filtered_image) ;

% Gradient Sobel
filtered_image = zeros(size(I)) ;
s = fspecial('sobel') ;
sobel1 = uint8(round(filter2(s,filtered_image)));
figure, imshow(filtered_image) ;


%Filtre non linéaire
IB = imnoise(I,'salt & pepper');
If2 = medfilt2(IB,[3 3]) ;
figure, imshow(If2) ;



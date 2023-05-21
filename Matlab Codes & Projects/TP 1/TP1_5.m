clear all ;
clc ;
close all ;
lena_Img = imread('lena.jpg') ;


I = lena_Img(1:32,1:32,1:3) ;

imshow(I) ;

lena_Img(150:150+31,390:390+31,1:3)=I;figure ;

imshow(lena_Img) ;

clc
clear all
close all
% nombre d’images 
nFrames = 7;   
addpath('C:\Users\akaro\OneDrive\Images\One Piece');
img_dir = dir('C:\Users\akaro\OneDrive\Images\One Piece\*.jpg');
for i = 1:nFrames                           
    framei=imread(img_dir(i).name);          
    image(framei);title([num2str(i),'/',num2str(nFrames)]);drawnow;
end

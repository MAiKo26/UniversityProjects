clc
clear all
close all
v={};      % Déclarer un vecteur où on mettra toutes les frames (matrice)
Video = VideoReader('OP.mp4'); % saisir la vidéo
numberOfFrames = Video.NumberOfFrames;  
vidHeight = Video.Height; 
vidWidth = Video.Width;   

startFrm=1;  % Premier frame
for k = 1 : numberOfFrames
   I= read(Video, k); % lecture de la vidéo
   v{k}=I;            % dans chaque case de vecteur, on saisi un frame
end



for i = startFrm:numberOfFrames        
    framei=v{i};                             
    image(framei);title([num2str(i),'/',num2str(numberOfFrames)]);drawnow;
end


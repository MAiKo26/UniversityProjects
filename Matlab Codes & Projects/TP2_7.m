fe=8000 ;%fr�quence d��chantillonnage
nbits1=8 ;%bits par �chantillon
mode1=1 ;%Choisir mode st�r�o ou mono
D1=6 ; %Dur�e de l�enregistrement en secondes
recObj = audiorecorder(fe,nbits1,mode1); % recObj est une variable objet
disp('Start speaking.')
recordblocking(recObj, D1); % parler au micro pendant 5 secondes
disp('End of Recording.');
% Store data in double-precision array.
myRecording = getaudiodata(recObj); % myRecording contient les donn�es son de type double
audiowrite ('son_enregi.wav', myRecording, fe);

% Play back the recording.
play(recObj); % Ecouter le son enregistr�
wavplay(y,Fe,'sync') ; % L'option 'sync' est facultative,
%voir sa signification dans la
% documentation Matlab.
sound(myRecording,fe, nbits1); % Ecouter le son enregistr�
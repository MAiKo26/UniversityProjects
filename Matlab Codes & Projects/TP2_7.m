fe=8000 ;%fréquence d’échantillonnage
nbits1=8 ;%bits par échantillon
mode1=1 ;%Choisir mode stéréo ou mono
D1=6 ; %Durée de l’enregistrement en secondes
recObj = audiorecorder(fe,nbits1,mode1); % recObj est une variable objet
disp('Start speaking.')
recordblocking(recObj, D1); % parler au micro pendant 5 secondes
disp('End of Recording.');
% Store data in double-precision array.
myRecording = getaudiodata(recObj); % myRecording contient les données son de type double
audiowrite ('son_enregi.wav', myRecording, fe);

% Play back the recording.
play(recObj); % Ecouter le son enregistré
wavplay(y,Fe,'sync') ; % L'option 'sync' est facultative,
%voir sa signification dans la
% documentation Matlab.
sound(myRecording,fe, nbits1); % Ecouter le son enregistré
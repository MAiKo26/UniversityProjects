fe=8000 ;%fr�quence d��chantillonnage
nbits1=8 ;%bits par �chantillon
mode1=1 ;%Choisir mode st�r�o ou mono
D1=6 ; %Dur�e de l�enregistrement en secondes
recObj = audiorecorder(fe,nbits1,mode1); % recObj est une variable objet
disp('Start speaking.')
recordblocking(recObj, D1); % parler au micro pendant 5 secondes
disp('End of Recording.');
myRecording = getaudiodata(recObj); % myRecording contient les donn�es son de type double
audiowrite ('x.wav', myRecording, fe);
play(recObj); 
wavplay(y,Fe,'sync') ; 
sound(myRecording,fe, nbits1); 


hello = myRecording(1:300);
etbonjour = myRecording(300:600);
toutlemonde = myRecording(600:1000);

sound(hello,Fs,nBits) ;
sound(etbonjour,Fs,nBits) ;
sound(toutlemonde,Fs,nBits) ;

sound([toutlemonde ; etbonjour ; hello], fs);
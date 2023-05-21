fe=8000 ;
nbits1=8 ;
mode1=1 ;
D1=4 ;
recObj = audiorecorder(fe,nbits1,mode1); 
disp('Start speaking.')
recordblocking(recObj, D1); 
disp('End of Recording.');
myRecording = getaudiodata(recObj);
audiowrite ('x1.wav', myRecording, fe);
play(recObj); 
pause ;
recObj2 = audiorecorder(fe,nbits1,mode1); 
disp('Start speaking.')
recordblocking(recObj2, D1); 
disp('End of Recording.');
myRecording2 = getaudiodata(recObj2);
audiowrite ('x2.wav', myRecording2, fe);
play(recObj2); 


y=x1(1:50)+x2(20:40) ;

sound(myRecording,fe, nbits1) ;
sound(myRecording2,fe, nbits1) ;
sound(y,fe, nbits1) ;
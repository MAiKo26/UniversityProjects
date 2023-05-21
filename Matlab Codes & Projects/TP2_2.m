y=s ;
Yfft=fft(y);
sp=abs(Yfft);
Te=1/Fe;
fe=1/Te;
N=length(y);
fr=0:(fe/N):(fe/2-fe/N);
figure(3),plot(fr,sp(1:(N/2)))
grid on


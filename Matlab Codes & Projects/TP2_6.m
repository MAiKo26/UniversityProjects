f0=5;
Fe=100;
Te=1/Fe;
N=50;
K=[0:N-1];
%la composante continue
signal=ones(1,N)*0.5;
figure(1), plot(signal);
pause;
Nharmonique=21;
for n=1:2:Nharmonique %les valeurs impaire
% on ajoute une harmonique à chaque fois
signal=signal+(sin(2*pi*n*f0*K*Te))*2/(pi*n);
figure (3), plot(signal)
pause;
end
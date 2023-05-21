son_inv = flipud('son_enregi.wav');
figure ;
subplot(2, 1, 1) ;
plot(y) ;
extrait = y(100 :1123) ;
subplot(2, 1, 2) ;
plot(extrait) ;

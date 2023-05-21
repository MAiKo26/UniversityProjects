Fs1 = 1000; % Sampling frequency théorème de shanonon fsampl>=2*f0
T1 = 1/Fs1; % Sampling period
%********
Fs2 = 2000; % Sampling frequency
T2 = 1/Fs2; % Sampling period
%******************
Fs3 = 3000; % Sampling frequency
T3 = 1/Fs3; % Sampling period
%*ù*******
Fs4 = 4000; % Sampling frequency
T4 = 1/Fs4; % Sampling period
%*******
L = 1000; % Length of signal
t1 = (0:L-1)*T1; % Time vector
t2 = (0:L-1)*T2; % Time vector
t3 = (0:L-1)*T3; % Time vector
t4 = (0:L-1)*T4; % Time vector

x1 = 0.5*cos(2*pi*440*t1); % First row wave
x2 = 0.5*cos(2*pi*880*t2); % Second row wave
x3 = 0.5*cos(2*pi*1320*t3); % Third row wave
x4 = 0.5*cos(2*pi*1760*t4); % Third row wave
X = [x1; x2; x3; x4];
t = [t1; t2; t3; x4];
for i = 1:4
subplot(4,1,i)
plot(t(i,1:100),X(i,1:100))
title(['Row',num2str(i),' in the Time Domain'])
end
sound(x1,Fs1)
pause;
sound(x2,Fs2)
pause;
sound(x3,Fs3)
pause;
sound(x4,Fs4)
pause;
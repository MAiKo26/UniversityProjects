Fs = 8192; % Sampling frequency théorème de shanonon fsampl&gt;=2*f0
T = 1/Fs; % Sampling period
%*******
% Length of signal
t = 0:T:1; % Time vector
do = cos(2*pi*262*t); % First row wave
re = cos(2*pi*294*t); % Second row wave
mi = cos(2*pi*330*t); % Third row wave
fa = cos(2*pi*349*t); % Third row wave
sol = cos(2*pi*392*t); % Third row wave
la = cos(2*pi*440*t); % Third row wave
si = cos(2*pi*494*t); % Third row wave
do2 = cos(2*pi*523*t); % Third row wave
%***********
%G1 = [do; re; mi; fa; sol; la; si; do2];
G = [do re mi fa sol la si do2];

sound(G,Fs)
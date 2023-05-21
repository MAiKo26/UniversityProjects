t = 0:0.1:10*pi;
x = exp(-t/20).*cos(t);
y = exp(-t/20).*sin(t);
z = t;
plot3(x,y,z);
xlabel('x');
ylabel('y');
zlabel('z');
grid
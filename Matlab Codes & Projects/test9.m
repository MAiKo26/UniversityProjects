t = 0:0.1:10*pi;
x = exp(-t/20).*cos(t);
y = exp(-t/20).*sin(t);
z = t;
subplot(2,2,1);plot3(x,y,z);
xlabel('x');
ylabel('y');
zlabel('z');
view(-10,10);
title('Default plot3');
grid
subplot(2,2,2);plot3(x,y,z,'og');
xlabel('x');
ylabel('y');
zlabel('z');
view(-9,56);
title('Az=-10, El=10');
grid
subplot(2,2,3);plot3(x,y,z,'xb');
xlabel('x');
ylabel('y');
zlabel('z');
view(0,90);
title('Az=0, El=90');
grid
subplot(2,2,4);plot3(x,y,z,'dr');
xlabel('x');
ylabel('y');
zlabel('z');
view(90,0);
title('Az=90, El=0');
grid
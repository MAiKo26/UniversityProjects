#include "Figure.h"

Figure::Figure()
{
    x=0;
    y=0;
    z=0;
}

Figure::Figure(double a, double b, double c):x(a),y(b),z(c)
{

}

Figure::~Figure()
{
    cout<<"destructeur de figure"<<endl;
}

 void Figure::description()
 {
     cout<<"je suis une figure"<<endl;
 }

 void Figure::affiche()
 {
     cout<<"x="<<x<<endl;
     cout<<"y="<<y<<endl;
     cout<<"z="<<z<<endl;
 }

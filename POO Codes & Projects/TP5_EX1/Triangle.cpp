#include "Triangle.h"


Triangle::Triangle()
{
    base=0;
    hauteur=0;
}

Triangle::Triangle(double a, double b)
{
    base=a;
    hauteur=b;
}

void Triangle::description()
 {
     cout<<"je suis un triangle."<<endl;
 }

  void Triangle::affiche()
 {

     Figure::affiche();
      cout<<"hauteur="<<hauteur<<endl;
      cout<<"base="<<base<<endl;
 }

Triangle::~Triangle()
{
    cout<<"destructeur de Triangle"<<endl;
}

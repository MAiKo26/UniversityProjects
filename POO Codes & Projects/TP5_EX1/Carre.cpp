#include "Carre.h"

Carre::Carre()
{
    largeur=0;
}

Carre::Carre(double a, double b, double c,double l):Figure(a,b,c),largeur(l)
{

}

Carre::Carre(double d):largeur(d)
{

}

void Carre::description()
 {
     cout<<"je suis un carre."<<endl;
 }

 void Carre::affiche()
 {
     Figure::affiche();
      cout<<"largeur="<<largeur<<endl;
 }

Carre::~Carre()
{
    cout<<"destructeur de Carre"<<endl;
}

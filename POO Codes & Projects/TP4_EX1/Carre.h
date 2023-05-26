#ifndef CARRE_H
#define CARRE_H

#include "Figure.h"
#include <iostream>
using namespace std;


class Carre : public Figure
{
    public:
        Carre();
        Carre(double d):largeur(d){};
        Carre(double a, double b, double c,double l):Figure(a,b,c),largeur(l){};
        void description();
        void affiche();
        ~Carre();

    private:
        double largeur;
};

#endif // CARRE_H

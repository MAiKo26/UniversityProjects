#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "Figure.h"
#include <iostream>
using namespace std;


class Triangle : public Figure
{
    public:
        Triangle();
        ~Triangle();
        Triangle(double a, double b);
        void affiche();
        void description();

    protected:

    private:
        double base;
        double hauteur;
};

#endif // TRIANGLE_H

#ifndef FIGURE_H
#define FIGURE_H

#include <iostream>
using namespace std;

class Figure
{
    public:
        Figure();
        Figure(double a, double b, double c);
        ~Figure();
        void description();
        void affiche();

    protected:
       double x;
       double y;
       double z;

    private:
};

#endif // FIGURE_H

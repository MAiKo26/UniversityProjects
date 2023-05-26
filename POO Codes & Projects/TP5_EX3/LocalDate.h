#ifndef LOCALDATE_H
#define LOCALDATE_H
#include <stdlib.h>
#include <iostream>
using namespace std;

class LocalDate
{
public:
        int annee;
        int mois;
        int jour;    

public:
        LocalDate();
        LocalDate(int a, int m, int j);
        void affiche(int format);
        bool estPlusAncienne(LocalDate ld);
        int calculDureeEnJour(LocalDate ld);

    protected:

    
};

#endif // LOCALDATE_H

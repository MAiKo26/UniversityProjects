#include "LocalDate.h"

LocalDate::LocalDate()
{
     annee=0;
     mois=0;
     jour=0;
}

LocalDate::LocalDate(int a, int m, int j)
{
     if(a<2019)
    {
        cout<<"valeur d'annee incorrecte"<<endl;
        exit(1);
    }
    if((m<1)||(m>12))
    {
        cout<<"valeur du mois incorrect"<<endl;
        exit(1);
    }
    if((j<1)||(j>30))
    {
        cout<<"valeur du jour incorrect"<<endl;
        exit(1);
    }

     annee=a;
     mois=m;
     jour=j;
}

void LocalDate::affiche(int format)
{
    if(format==1)
        cout<<jour<<"-"<<mois<<"-"<<annee<<endl;
    else
        cout<<jour<<"/"<<mois<<"/"<<annee<<endl;
}

bool LocalDate::estPlusAncienne(LocalDate ld)
{
    bool res=true;
    if(ld.annee<annee)
        {res=false;}
    else if (ld.annee==annee)
        {if(ld.mois<mois)
         res=false;
        else if(ld.mois==mois)
            {if(ld.jour<jour)
            res=false;
            }
        }
    return res;
}

int LocalDate::calculDureeEnJour(LocalDate ld)
{
    int nbrJour=(ld.mois-mois)*30+ld.jour-jour;
    if(estPlusAncienne(ld))
        return(nbrJour);
    else
        return(-nbrJour);


}

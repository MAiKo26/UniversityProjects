#include "DVD.h"

DVD::DVD()
{
     style="";
     duree=0;
}

void DVD::affiche()
{
    Media::affiche();
    cout<<"------Type du media : DVD-----"<<endl;
    cout<<"Informations:"<<endl;
    cout<<"style:"<<style<<endl;
    cout<<"duree:"<<duree<<endl<<endl<<endl<<endl;
}

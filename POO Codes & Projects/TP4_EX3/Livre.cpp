#include "Livre.h"

Livre::Livre()
{

     auteur="";
     nbr_page=0;
}

void Livre::affiche()
{
    Document::affiche();
    cout<<"Livre "<<endl;
    cout<<"auteur:"<<auteur<<endl;
    cout<<"Nombre de pages:"<<nbr_page<<endl<<endl<<endl<<endl;
}



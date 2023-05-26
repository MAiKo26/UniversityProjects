#include "Medicament.h"

Medicament::Medicament()
{
     m_nom="none";
     m_prix=0;
     m_stock=0;
}

Medicament::Medicament(string s, float f, int i)
{
     m_nom=s;
     m_prix=f;
     m_stock=i;
}

void Medicament::affiche()
{
    cout<<"---------------------"<<endl;
    cout<<"Medicament: "<<m_nom<<endl;
    cout<<"Prix: "<<m_prix<<endl;
    cout<<"Stock: "<<m_stock<<endl;

}

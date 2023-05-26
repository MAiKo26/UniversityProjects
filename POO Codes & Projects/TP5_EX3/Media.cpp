#include "Media.h"

Media::Media()
{
     titre="";
     est_prete=false;
     nbrJourDePret=0;
}

Media::Media(string t)
{
    titre=t;
    est_prete=false;
}

bool Media::empreint(LocalDate datePret, int nbrJour)
{
    if(est_prete==true)
    {
        cout<< "Le media selectionne est deje prete" <<endl;
        return false;
    }

    est_prete=true;
    dateDePret=datePret;
    this->nbrJourDePret=nbrJour;
    return true;
}

void Media::retourEmpreint(LocalDate dateRetour)
{
    int nb=dateDePret.calculDureeEnJour(dateRetour);
    if(nb>nbrJourDePret)
        cout<<"Vous devez payer 1Dt pour le retard de "<<nb<<" jours"<<endl;
    est_prete=false;
    dateDeRetour=dateRetour;
}

void Media::affiche()
{
    cout<<"titre: "<<titre<<endl;
    if(est_prete)
    {
        cout<<"Etat: Empreinte"<<endl;
        cout<<" informations d'empreint:"<<endl<<"Date d'empreint: ";
        dateDePret.affiche(1);
        cout<<"Nombre de jours de prêt:"<<nbrJourDePret<<endl;

    }
    else
        cout<<"Etat: Disponible"<<endl;

}


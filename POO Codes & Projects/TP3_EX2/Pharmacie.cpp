#include "Pharmacie.h"

Pharmacie::Pharmacie()
{
     nbr_clients=0;
     nbr_meds=0;
}

void Pharmacie::addClient(Client c)
{
    if(nbr_clients<100)
    {
        p_tab_clients[nbr_clients]=c;
        nbr_clients++;
    }
    else
        cout<<"impossible d'ajouter le client: "<<c.Getc_nom()<<". Le nombre de clients max est atteint."<<endl;

}
void Pharmacie::addMed(Medicament m)
{
    if(nbr_meds<100)
    {
        p_tab_meds[nbr_meds]=m;
        nbr_meds++;
    }
    else
     cout<<"impossible d'ajouter le Medicament: "<<m.Getm_nom()<<". Le nombre de clients max est atteint."<<endl;

}

void Pharmacie::achat(int nc,int nm, int nbr)
{
    //on va supposer que le num du médicament et du client correspondent à leurs indices dans le tableau
   //Etape 1: vérifier que le client et le médicament existent
   if((nc>=0)&&(nc<100)&&(nm>=0)&&(nm<100)) //les numéros sont dans l'intervalle des indices du tableau
    if ((p_tab_meds[nm].Getm_nom()!="none") && (p_tab_clients[nc].Getc_nom()!="none"))// la case correspondant au numéro est bien renseignée, il ne s'agit pas d'une case vide du tableau
   {
       int s=p_tab_meds[nm].Getm_stock();
       if(nbr<=s)//vérifier que le nombre de boites est disponible dans le stock du médicament en question
       {
        p_tab_meds[nm].Setm_stock(s-nbr);
        float ancienCredit=p_tab_clients[nc].Getc_credit();
        float nouveauCredit=ancienCredit+nbr*p_tab_meds[nm].Getm_prix();
        p_tab_clients[nc].Setc_credit(nouveauCredit);
        cout<<endl<<"le client :"<< p_tab_clients[nc].Getc_nom()<<" a achete "<<nbr<<" boites du medicament : "<<p_tab_meds[nm].Getm_nom()<<" avec SUCCES!!"<<endl<<endl;
       }
       else
       {
        cout<<"ERREUR: impossible de proceder a l'achat, le stock du medicament est insuffisant: "<<endl;
        cout <<"nom du medicament: "<<p_tab_meds[nm].Getm_nom()<<"----stock disponible: "<<p_tab_meds[nm].Getm_stock()<<"----Nombre de boites demandees: "<<nbr<<endl;
       }
   }
   else//case du tableau non renseignée
    cout<<" ERREUR: le medicament ou le client n'existe pas "<<endl;
   else //numéro incorrecte
    cout<<" ERREUR: le numero du client ou du medicament est incorrect"<<endl;

}

void Pharmacie::affiche()
{
    cout<<"**********LISTE DES CLIENTS************"<<endl;
    for(int i=0;i<nbr_clients;i++)
        p_tab_clients[i].affiche();
    cout<<"**********LISTE DES MEDICAMENTS************"<<endl;
    for( int i=0;i<nbr_meds;i++)
        p_tab_meds[i].affiche();

}

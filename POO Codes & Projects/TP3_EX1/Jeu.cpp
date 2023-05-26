#include "Jeu.h"

Jeu::Jeu()
{
    nom="aucun";
    min_age=0;
    Nbr_ticket=0;
}

Jeu::Jeu(string n, int mina,int Nbtick)
{
    nom=n;
    min_age=mina;
    Nbr_ticket=Nbtick;
}

string Jeu::getnom()
{
    return nom;
}

 int Jeu::getNbTickets()
 {
     return Nbr_ticket;
 }

 int Jeu::getminAge()
 {
     return min_age;
 }

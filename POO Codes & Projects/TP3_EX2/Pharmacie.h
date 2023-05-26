#ifndef PHARMACIE_H
#define PHARMACIE_H
#include "Client.h"
#include "Medicament.h"
#include <iostream>

using namespace std;

class Pharmacie
{
	 private:
        Client p_tab_clients[100];
        Medicament p_tab_meds[100];
        int nbr_clients;
        int nbr_meds;

    public:
        Pharmacie();
        void addClient(Client );
        void addMed(Medicament );
        void achat(int,int, int);
        void affiche();



   
};

#endif // PHARMACIE_H

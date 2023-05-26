#ifndef MEDIA_H
#define MEDIA_H
#include "LocalDate.h"


class Media
{
    public:
        Media();
        Media(string t);
        bool empreint(LocalDate datePret, int nbrJour);
        void retourEmpreint(LocalDate dateRetour);
        void affiche();


    protected:
        string titre;
        bool est_prete;
        int nbrJourDePret;
        LocalDate dateDePret;
        LocalDate dateDeRetour;

    private:
};

#endif // MEDIA_H

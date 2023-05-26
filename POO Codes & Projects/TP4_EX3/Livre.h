#ifndef LIVRE_H
#define LIVRE_H

#include "Document.h"


class Livre : public Document
{
    public:
        Livre();
        Livre(string t, int w, string a, int i):Document(t,w),auteur(a),nbr_page(i){};
        void affiche();

    protected:

    private:
        string auteur;
        int nbr_page;
};

#endif // LIVRE_H

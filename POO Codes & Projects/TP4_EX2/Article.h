#ifndef ARTICLE_H
#define ARTICLE_H

#include <iostream>
#include <string>
using namespace std;


class Article
{
    public:
        Article();
        ~Article();

        string getNom() { return nom; }
        void setNom(string val) { nom = val; }
        double getPrix() { return prix; }
        void setPrix(double val) { prix = val; }
        void afficher();

    private:
        string nom;
        double prix;
};

#endif // ARTICLE_H

#ifndef ARTICLE_H
#define ARTICLE_H

#include <iostream>
#include <string>
using namespace std;


class Article
{
    
  private:
        string nom;
        double prix;

public:
        Article();
        ~Article();

        string getNom() { return nom; }
        void setNom(string val) { nom = val; }
        double getPrix() { return prix; }
        void setPrix(double val) { prix = val; }
        void afficher();

  
};

#endif // ARTICLE_H

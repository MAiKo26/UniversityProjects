#include "ArticleEnSolde.h"

ArticleEnSolde::ArticleEnSolde()
{
    remise=0;
}

ArticleEnSolde::~ArticleEnSolde()
{
    cout<<"destructeur d'article en solde"<<endl;
}

void ArticleEnSolde::setRemise(int r)
{
    remise=r;
}

double ArticleEnSolde::getPrix()
{
    double nouveauprix=0;
    nouveauprix=Article::getPrix()-(Article::getPrix()*remise)/100;
    return nouveauprix;
}

void ArticleEnSolde::afficher()
{
    cout<<"prix de l'article en solde "<<getNom()<<": Avant remise="<<Article::getPrix()<<"    apres remise="<<getPrix()<<endl;
}

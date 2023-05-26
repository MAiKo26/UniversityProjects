#include "Article.h"

Article::Article()
{
    nom="none";
    prix=-1;
}

Article::~Article()
{
    cout<<"destructeur d'article"<<endl;
}

void Article::afficher()
{
    cout<<"prix de l'article "<<nom<<"="<<prix<<endl;
}

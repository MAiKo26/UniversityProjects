#ifndef ARTICLEENSOLDE_H
#define ARTICLEENSOLDE_H

#include "Article.h"


class ArticleEnSolde : public Article
{
   
private:
        int remise;

public:
        ArticleEnSolde();
        ~ArticleEnSolde();
        void setRemise(int r);
        double getPrix();
        void afficher();

    
};

#endif // ARTICLEENSOLDE_H

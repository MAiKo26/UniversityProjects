#ifndef ARTICLEENSOLDE_H
#define ARTICLEENSOLDE_H

#include "Article.h"


class ArticleEnSolde : public Article
{
    public:
        ArticleEnSolde();
        ~ArticleEnSolde();
        void setRemise(int r);
        double getPrix();
        void afficher();

    private:
        int remise;
};

#endif // ARTICLEENSOLDE_H

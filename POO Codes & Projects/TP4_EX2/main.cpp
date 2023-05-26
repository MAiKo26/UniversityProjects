#include <iostream>
#include "ArticleEnSolde.h"

using namespace std;

int main()
{

    ArticleEnSolde a2;

    a2.setNom("chaussureX");
    a2.setPrix(200);
    a2.setRemise(10);
    a2.afficher();
    cout<<"deuxieme remise"<<endl;
    a2.setRemise(30);
    a2.afficher();

}

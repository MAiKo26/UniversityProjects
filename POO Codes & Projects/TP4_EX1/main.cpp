#include <iostream>
#include "Carre.h"
#include "Triangle.h"

using namespace std;

int main()
{
    //création des objets en utilisant les constructeurs par défaut
    Figure f1;
    Carre c1;
    Triangle t1;

        cout<<"--------------AFFICHAGE 1----------------"<<endl;
    //afficher les attributs
    cout<<"*********figure*********"<<endl;
    f1.affiche();
    cout<<"*********carre*********"<<endl;
    c1.affiche();
    cout<<"*********triangle*********"<<endl;
    t1.affiche();

    //utiliser les constructeurs paramétrés
    Carre c2(20);
    Triangle t2(10,20);

    cout<<"--------------AFFICHAGE 2----------------"<<endl;
     //afficher les attributs
    cout<<"*********figure*********"<<endl;
    f1.affiche();
    cout<<"*********carre*********"<<endl;
    c2.affiche();
    cout<<"*********triangle*********"<<endl;
    t2.affiche();

}

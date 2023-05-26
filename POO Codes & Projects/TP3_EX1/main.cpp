#include <iostream>
#include "Client.h"
#include <vector>

using namespace std;

int main()
{
    Client c1;
    Client c2(100,20);
    Client c3(200,15,10);
	    Client c4(1,8,10);
    Client c5(2,11,10);
    
	
	vector <Jeu> tabj;


    tabj.push_back(Jeu ("Grande Roue",6,4));
    tabj.push_back(Jeu ("Grand huit",10,5));
    tabj.push_back(Jeu ("kaskas",10,5));
    tabj.push_back(Jeu ("course",6,5));

    for(int i=0;i<tabj.size();i++)
    {
        c4.jouer(tabj[i]);
        c5.jouer(tabj[i]);
    }

    c4.affiche();
    c5.affiche();
    return 0;
}

#include <iostream>
#include "Pharmacie.h"

using namespace std;

int main()
{
    Pharmacie p1;
    p1.addClient(Client ("Client1"));
    p1.addClient(Client ("Client2"));
    p1.addClient(Client ("Client3"));

    p1.addMed(Medicament("Med1",12.5,25));
    p1.addMed(Medicament("Med2",15.5,35));
    p1.addMed(Medicament("Med3",20.5,50));

    p1.achat(0,1,5);
    p1.affiche();
    return 0;
}

#include <iostream>
#include "Media.h"
#include "Livre.h"
#include "DVD.h"
#include "LocalDate.h"
#include "Revue.h"

using namespace std;

int main()
{

    DVD d1("whild Life", "rock", 56);
    Livre l1("devenir", 3152, "Michelle Aubama", 448 );
    Revue r1("l’infirmière", 1248, LocalDate(2019,2,1) );

    l1.empreint(LocalDate(2019,11,20),7);

     d1.affiche();
    l1.affiche();
    r1.affiche();

    l1.retourEmpreint(LocalDate(2019,12,30));

    l1.affiche();


}

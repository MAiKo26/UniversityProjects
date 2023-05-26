
#include <iostream>

#include "Jeu.h"
using namespace std;

class Client
{
    public:
        Client(int num=0, int age=0 , int nbTick=0);
        void affiche();
        bool verifTicket(Jeu varj);
        bool verifAge(Jeu varj);
        void jouer(Jeu varj);

        void setNbrticket(int);
        int getNbrticket();

    private:
        int c_num;
        int c_age;
        int c_nbr_ticket;

    
};






#endif // CLIENT_H

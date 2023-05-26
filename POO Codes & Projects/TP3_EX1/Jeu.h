

#include <string>
using namespace std;

class Jeu
{
    public:
        Jeu();
        Jeu(string,int,int);
        int getNbTickets();
        int getminAge();
        string getnom();
    private:
        string nom;
        int min_age;
        int Nbr_ticket;
};

#endif // JEU_H

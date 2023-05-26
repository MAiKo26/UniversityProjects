#ifndef CLIENT_H
#define CLIENT_H
#include <string>
#include <iostream>

using namespace std;

class Client
{
private:
        string c_nom;
        float c_credit;    

public:
        Client();
        Client(string);
        void affiche();

        string Getc_nom() { return c_nom; }
        void Setc_nom(string val) { c_nom = val; }
        float Getc_credit() { return c_credit; }
        void Setc_credit(float val) { c_credit = val; }

   
    
};

#endif // CLIENT_H

#include "Client.h"


Client::Client(int num, int age , int nbTick)
{
    c_num=num;
    c_age=age;
    c_nbr_ticket=nbTick;
}

void Client::affiche()
{
    cout<<"client numero: "<<c_num<<endl;
    cout<<"Age: "<<c_age<<endl;
     cout<<"Nombre des tickets: "<<c_nbr_ticket<<endl;

}

bool Client::verifTicket(Jeu varj)
{
if(c_nbr_ticket>=varj.getNbTickets())
    return true;
else
    return false;
}



bool Client::verifAge(Jeu varj)
{
    if(c_age>=varj.getminAge())
        return true;
else
    return false;
}

void Client::jouer(Jeu varj)
{

if(verifAge(varj) && verifTicket(varj))
    //jouer au jeu
    c_nbr_ticket-=varj.getNbTickets();
c_nbr_ticket=c_nbr_ticket-varj.getNbTickets();
else
    cout<<"le client numero: "<<c_num<<" n'est pas autorise à jouer au jeu: "<< varj.getnom()<<endl;
}

void Client::setNbrticket(int n)
{
    c_nbr_ticket=n;
}

int Client::getNbrticket()
{
            return c_nbr_ticket;
}

#include "Client.h"

Client::Client()
{
    c_nom="none";
    c_credit=0;

   }

Client::Client(string s)
{
    c_nom=s;
    c_credit=0;
}

void Client::affiche()
{
    cout<<"---------------------"<<endl;
    cout<<"Client: "<<c_nom<<endl;
    cout<<"Credit: "<<c_credit<<endl;
}


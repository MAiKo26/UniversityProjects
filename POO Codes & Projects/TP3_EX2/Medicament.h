#ifndef MEDICAMENT_H
#define MEDICAMENT_H
#include <string>
#include <iostream>
using namespace std;

class Medicament
{
   
private:
        string m_nom;
        float m_prix;
        int m_stock;

public:
        Medicament();
        Medicament(string s, float f, int i);
        void affiche();

        string Getm_nom() { return m_nom; }
        void Setm_nom(string val) { m_nom = val; }
        int Getm_stock() { return m_stock; }
        void Setm_stock(int val) { m_stock = val; }
        float Getm_prix() { return m_prix; }


    
};

#endif // MEDICAMENT_H

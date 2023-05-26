#include "Revue.h"

 void Revue::affiche()
 {
     Document::affiche();
     cout<<"date de publication:"<<endl;
     datePub.affiche(1);
     cout<<endl<<endl<<endl<<endl;
 }

#include "Document.h"
#include "Media.h"

Document::Document()
{
    num_enregist=-1;
}

void Document::affiche()
{
    Media::affiche();
    cout<<"------Type du media : Document-----"<<endl;
    cout<<"Numero:"<<num_enregist<<endl;
}

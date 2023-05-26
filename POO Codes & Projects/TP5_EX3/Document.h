#ifndef DOCUMENT_H
#define DOCUMENT_H

#include "Media.h"


class Document : public Media
{
    public:
        Document();
        Document(string a, int i):Media(a),num_enregist(i){};
        void affiche();
    protected:
        int num_enregist;


};


#endif // DOCUMENT_H

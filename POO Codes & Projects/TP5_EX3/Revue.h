#ifndef REVUE_H
#define REVUE_H

#include "Document.h"


class Revue : public Document
{
    public:
        Revue():datePub(LocalDate(0,0,0)){};
        Revue(string t, int w,  LocalDate d):Document(t,w),datePub(d){};
        LocalDate GetdatePub() { return datePub; }
        void SetdatePub(LocalDate val) { datePub = val; }
         void affiche();

    protected:

    private:
        LocalDate datePub;
};

#endif // REVUE_H

#ifndef DVD_H
#define DVD_H

#include "Media.h"


class DVD : public Media
{
    public:
        DVD();
        DVD(string t, string s, int d):Media(t),style(s),duree(d){};
        void affiche();

    protected:

    private:
        string style;
        int duree;
};

#endif // DVD_H

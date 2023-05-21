list = [];


b = input('donne la note déleve');

a = int(b);

NPE = a ;
NME = a ;
NBN = 0 ;
TOT = 0 ;

while (a>0):
    list.append(a);
    NBN = NBN +1 ;
    if (a > NPE):
        NPE = a ;
    if (a < NME):
        NME = a ;
    TOT = TOT + a ;

    print(' Le nombre de note entrée ',NBN,' Le nombre le plus eleve est ',NPE,'Le nombre le moins eleve est ',NME,' le nombre moyenne est ',TOT/NBN);

    b = input('donne la note déleve');

    a = int(b);


def eststochastique(P):
    nl = len(P)  
    nc = len(P[0]) 
 
    etat = True
    for i in range(nl):
        s = 0
        for j in range(nc):
            s += P[i][j]
        if s > 1:
            etat = False
            break
    return etat
 
 
def estbistochastique(P):
    nl = len(P)  
    nc = len(P[0])  
 
    etat = True  
    if(eststochastique(P)):
        for j in range(nc):
            s = 0
            for i in range(nl):
                s += P[i][j]
            if s > 1:
                etat = False
                break
    return etat
 
 
def vecteurstable(G, h):
    nl = len(G)  
    nc = len(G[0])  
    etat = True
    if(eststochastique(G)):
        for j in range(nc):
            s = 0
            for i in range(nl):
                s += h[i]*G[i][j]
            if s != h[j]:
                etat = False
                break
    else:
        etat = False
    return etat

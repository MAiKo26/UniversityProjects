# -*- coding: utf-8 -*-
"""
Created on Tue Dec  7 08:24:33 2022

@author: Mohamed Aziz Karoui
"""

import numpy as np
import matplotlib.pyplot as plt
from PIL import Image
import cv2 as cv
from skimage import data
from scipy import signal
from matplotlib.pyplot import imshow, get_cmap
from skimage.filters import median



"1 Lire et affiche Image"

img = Image.open("Lena.jpg") 
img.show()


"2 Compo Verte"

tab = np.array(img)
n0 = Image.fromarray(tab)
n0.show()


G= tab[:,:,1]

G=0.587*G  

n1 = Image.fromarray(G)
n1.show()


"3 Négation"

tab4 = -tab
n4 = Image.fromarray(tab4)
n4.show()
                        
                        
"4 Niveaux Gris"

tab2 = tab[:,:,1]
n2 = Image.fromarray(tab2)
n2.show()


"5 Histogramme"

height, width = tab2.shape
hist = np.zeros(256,int)
for i in range(0,height-1):
    for j in range(0,width-1):
        hist[tab2[i,j]] = hist[tab2[i,j]] + 1 

print(hist)
plt.plot(hist)
plt.show(hist.all())



"6 Binaire"

tab5 = tab2
for i in range(0,height-1):
    for j in range(0,width-1):
        if tab5[i,j] > 100:
            tab5[i,j] = 255
        else:
            tab5[i,j] = 0
            
n5 = Image.fromarray(tab5)
n5.show()

"7 Recadrage"

"8 Filtre Passe Haut"

"9 Filtre Morphologique"

"10 Segmenter"

"11 Filtre de Canny"

"12 Méthode contours actifs"

"13 Transformée de Hough"

"14 Autre Espace Couleur"

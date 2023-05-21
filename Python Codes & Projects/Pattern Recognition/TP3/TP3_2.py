# -*- coding: utf-8 -*-
"""
Created on Thu Nov  3 10:38:53 2022

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


img = cv.imread("Texte_NG.jpg",0)


"""OTSU"""

import numpy as np
import cv2 as cv

fenetre = 'Image OTSU'
cv.namedWindow(fenetre)
thresh,imgbin=cv.threshold(img,0,255,cv.THRESH_OTSU)
cv.imshow(fenetre,imgbin)
print( 'Valeur seuil OTSU ', thresh)
cv.waitKey(0)
cv.destroyAllWindows()

""" globale et adaptative"""

ret,th1 = cv.threshold(img,150,255,cv.THRESH_BINARY) # binarisation 
th2 = cv.adaptiveThreshold(img,255,cv.ADAPTIVE_THRESH_MEAN_C,\
            cv.THRESH_BINARY,15,2)
th3 = cv.adaptiveThreshold(img,255,cv.ADAPTIVE_THRESH_GAUSSIAN_C,\
            cv.THRESH_BINARY,15,2)

titles = [' Image original', 'Seuillage global (v = 150)',
            'Seuillage moyen adaptatif', 'Seuillage gaussien adaptatif']
images = [img, th1, th2, th3]

for i in range(4):
   
    plt.subplot(2,2,i+1),plt.imshow(images[i],'gray')
    plt.title(titles[i])
    plt.xticks([]),plt.yticks([])
plt.show()
S
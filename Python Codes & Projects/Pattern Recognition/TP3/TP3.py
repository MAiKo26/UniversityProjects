# -*- coding: utf-8 -*-
"""
Created on Sat Nov 12 14:16:52 2022

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
from sklearn.cluster import KMeans



""" 1 - Les types de segmentation les plus adaptés sont :
    Segmentation par apprentisage
    Segmentation par seuillage
    Segmentation par approche région
    Segmentation par approche contour
    
 2a - Il faut fixer le nombre de classes a 2 car on a le text en noir et le background en blanc"""

 
 
""" 2b k-moyennes """





img=cv.imread("Texte_NG.jpg")

img2 = img.reshape((-1,3))

img2 = np.float32(img)


criteria = (cv.TERM_CRITERIA_EPS + cv.TERM_CRITERIA_MAX_ITER, 10, 1.0)

k=2

attempts = 10

ret,label,center=cv.kmeans(img2,k,None,criteria,10,cv.KMEANS_RANDOM_CENTERS)

center = np.uint8(center)

res = center[label.flatten()]
res2 = res.reshape((img.shape))
cv.imwrite("segmented.jpg",res2) 

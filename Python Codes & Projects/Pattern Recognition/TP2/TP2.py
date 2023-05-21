# -*- coding: utf-8 -*-
"""
Created on Wed Oct 19 09:58:41 2022

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
    

"""  1 ; 2 """
    


img = Image.open("Crayfish_NG.jpg")
tab = np.array(img)
  
height, width = tab.shape
hist = np.zeros(256,int)
for i in range(0,height-1):
    for j in range(0,width-1):
        hist[tab[i,j]] = hist[tab[i,j]] + 1 
        
        
print(hist)
plt.plot(hist)
plt.show(hist.all())

""" 3a """


max = 0
min = 0

for i in range(hist.size):
    if hist[i]>max:
        max = hist[i]
    if hist[i]<min:
        min = hist[i]


for i in range(0,height-1):
    for j in range(0,width-1):
        tab[i,j] = (255/(max-min))*(tab[i,j]-min)
        
nouvelle_image=Image.fromarray(tab)
nouvelle_image.show()


cv.waitKey(0)

""" 3b """

img = Image.open("Crayfish_NG.jpg")
tab = np.array(img)
newImg = cv.threshold(tab, 100, 255, cv.THRESH_BINARY)
nouvelle_image=Image.fromarray(newImg[1])
nouvelle_image.show()

img = Image.open("Ecriture_NG.jpg")
tab = np.array(img)
newImg = cv.threshold(tab, 130, 255, cv.THRESH_BINARY)
nouvelle_image=Image.fromarray(newImg[1])
nouvelle_image.show()

img = Image.open("Chiffre_NG.jpg")
tab = np.array(img)
newImg = cv.threshold(tab, 100, 255, cv.THRESH_BINARY)
nouvelle_image=Image.fromarray(newImg[1])
nouvelle_image.show()

""" 3c """

def displayTwoBaWImages(img1, img2):
  _, axes = plt.subplots(ncols=2)
  axes[0].imshow(img1, cmap=plt.get_cmap('gray'))
  axes[1].imshow(img2, cmap=plt.get_cmap('gray'))
  
tab4 = np.array(img)
tab5 = np.array(img)


filtre1 =[[1/16,2/16,1/16],
          [2/16,4/16,2/16],
          [1/16,2/16,1/16]]
filtre2 = [[-1,0,1],
           [-2,0,2],
           [-1,0,1]]

imgconvol1 = signal.convolve2d(tab4, 
                              filtre1, 
                              mode='same',
                              boundary='fill', 
                              fillvalue=0)
displayTwoBaWImages(tab4, imgconvol1)

imgconvol2 = signal.convolve2d(tab5, 
                              filtre1, 
                              mode='same',
                              boundary='fill', 
                              fillvalue=0)
displayTwoBaWImages(tab4, imgconvol2)


""" 3d on utilise filtre médian pour fix le bruit sel """

img_salt = cv.imread("Brain.png")

median = cv.medianBlur(img_salt,3)



cv.imshow("Original", img_salt)
cv.imshow("cv2 median", median)

cv.waitKey(0)          
cv.destroyAllWindows() 
             



"""4"""


imgJ = cv.imread("J.png", 0)

kernel = np.ones((5, 5), np.uint8)
 

img_erosion = cv.erode(imgJ, kernel, iterations=1)
img_dilation = cv.dilate(imgJ, kernel, iterations=1)
img_ouvereture = cv.erode(img_dilation, kernel, iterations=1)
img_fermeture = cv.dilate(img_erosion, kernel, iterations=1)

cv.imshow('Input', imgJ)
cv.waitKey(0)
cv.imshow('Erosion', img_erosion)
cv.waitKey(0)
cv.imshow('Dilation', img_dilation)
cv.waitKey(0)
cv.imshow('Ouvereture', img_ouvereture)
cv.waitKey(0)
cv.imshow('Fermeture', img_fermeture)

cv.waitKey(0)



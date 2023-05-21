# -*- coding: utf-8 -*-
"""
Created on Sat Nov 12 16:16:55 2022

@author: Mohamed Aziz Karoui
"""

from skimage.filters import sobel
import cv2 
import numpy as np
import matplotlib.pyplot as plt

""" 1- c'est la segmentation par approche du région ou on split l'image en deux , objet et arriere plan """




""" 2-a C'est les filtres Sobel et c'est un filtre utilisé dans la segemntation par approche contour 
et ils sont utilisés pour l'approximation du gradient le premier c'est vertical et le 2éme c'est horizental"""


filtrea = [1,0,-1,
           2,0,-2,
           1,0,-1]

filtreb = [1,2,1,
           0,0,0,
           -1,-2,-1]


""" 2-b Methode 1 """


img = cv2.imread("feuille.png",0)
sobel_img = sobel(img)
cv2.imshow("original",img)
cv2.imshow("sobel",sobel_img)
cv2.waitKey(0)
cv2.destroyAllWindows()

""" Methode 2 """

# function for displaying image
def display(img):
    fig = plt.figure(figsize=(12,10))
    ax = fig.add_subplot(111)
    ax.imshow(img,cmap='gray')
    ax.axis('off')



# sobel kernel
sobel_x = np.array([[-1, -2, -1],
                    [ 0,  0,  0],
                    [ 1,  2,  1]])

sobel_y = np.array([[-1, 0, 1],
                    [-2, 0, 2],
                    [-1, 0, 1]])


img = cv2.imread("feuille.png",0)
i = np.array(img)
display(i)

# partial derivative in x-direction
edge_x = cv2.filter2D(src=i, ddepth=-1, kernel=sobel_x)
display(edge_x)

edge_x[edge_x != 0] = 255
display(edge_x)

# partial derivative in y-direction
edge_y = cv2.filter2D(src=i, ddepth=-1, kernel=sobel_y)
display(edge_y)

edge_y[edge_y != 0] = 255
display(edge_y)

# combinte the x and y edge
add_edge = edge_x + edge_y
display(add_edge)

add_edge[add_edge != 0] = 255
display(add_edge)


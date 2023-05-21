# -*- coding: utf-8 -*-
"""
Created on Wed Oct 19 08:56:41 2022

@author: Mohamed Aziz Karoui
"""

import numpy as np
import matplotlib.pyplot as plt
from PIL import Image



""" Partie 1 """

im=Image.open("lena.jpg")
tab=np.array(im)
im.show()

print("taille : ", tab.size)

print("nbr de lignes : ",tab.shape[0])

print("nbr de Colonnes : ",tab.shape[1])

print("nbr de Composantes de couleurs : ",tab.shape[2] )


""" Partie 2 """

red_lena = tab
red_lena[:,:,1] = 0
red_lena[:,:,2]= 0
nouvelle_image=Image.fromarray(red_lena)
nouvelle_image.save("Lena_Rouge.jpg")

im=Image.open("Lena_Rouge.jpg")
im.show()


""" Partie 3 """

R, G, B = tab[:,:,0], tab[:,:,1], tab[:,:,2]

Y=0.299*R + 0.587*G + 0.114*B 


nouvelle_image=Image.fromarray(Y)
nouvelle_image.show()


""" Partie 4 """

tab2 = np.array(im)

# get height and width of the image
height, width, _ = tab.shape
  
for i in range(0, height - 1):
    for j in range(0, width - 1):
          
        # Get the pixel value
        pixel = tab2[i, j]
          
        # Negate each channel by 
        # subtracting it from 255
          
        # 1st index contains red pixel
        pixel[0] = 255 - pixel[0]
          
        # 2nd index contains green pixel
        pixel[1] = 255 - pixel[1]
          
        # 3rd index contains blue pixel
        pixel[2] = 255 - pixel[2]
          
        # Store new values in the pixel
        tab2[i, j] = pixel
  
# Display the negative transformed image
plt.imshow(tab2)
plt.show()

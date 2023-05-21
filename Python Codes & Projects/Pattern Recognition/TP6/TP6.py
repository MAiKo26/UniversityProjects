# -*- coding: utf-8 -*-
"""
Created on Sun Nov 13 15:11:20 2022

@author: Mohamed Aziz Karoui
"""

import cv2
import numpy as np




img = cv2.imread("F1.jpg")


""" 1 """

hsv = cv2.cvtColor(img,cv2.COLOR_BGR2HSV)
cv2.imshow('HSV',hsv)

cv2.waitKey(0)

rvb = cv2.cvtColor(img,cv2.COLOR_BGR2RGB)
cv2.imshow('RVB',rvb)

cv2.waitKey(0)

luv = cv2.cvtColor(img,cv2.COLOR_BGR2Luv)
cv2.imshow('Luv',luv)

cv2.waitKey(0)

lab = cv2.cvtColor(img,cv2.COLOR_BGR2Lab)
cv2.imshow('Lab',lab)


cv2.waitKey(0)

""" 2 """


def create_bar(height, width, color):
    bar = np.zeros((height, width, 3), np.uint8)
    bar[:] = color
    red, green, blue = int(color[2]), int(color[1]), int(color[0])
    return bar, (red, green, blue)

img = cv2.imread('F1.jpg')
height, width, _ = np.shape(img)
# print(height, width)

data = np.reshape(img, (height * width, 3))
data = np.float32(data)

number_clusters = 5
criteria = (cv2.TERM_CRITERIA_EPS + cv2.TERM_CRITERIA_MAX_ITER, 10, 1.0)
flags = cv2.KMEANS_RANDOM_CENTERS
compactness, labels, centers = cv2.kmeans(data, number_clusters, None, criteria, 10, flags)
# print(centers)

font = cv2.FONT_HERSHEY_SIMPLEX
bars = []
rgb_values = []

for index, row in enumerate(centers):
    bar, rgb = create_bar(200, 200, row)
    bars.append(bar)
    rgb_values.append(rgb)

img_bar = np.hstack(bars)

for index, row in enumerate(rgb_values):
    image = cv2.putText(img_bar, f'{index + 1}. RGB: {row}', (5 + 200 * index, 200 - 10),
                        font, 0.5, (255, 0, 0), 1, cv2.LINE_AA)
    print(f'{index + 1}. RGB{row}')

cv2.imshow('Image', img)
cv2.imshow('Dominant colors', img_bar)
# cv2.imwrite('output/bar.jpg', img_bar)

cv2.waitKey(0)

img = cv2.imread('F2.jpg')
height, width, _ = np.shape(img)
# print(height, width)

data = np.reshape(img, (height * width, 3))
data = np.float32(data)

number_clusters = 5
criteria = (cv2.TERM_CRITERIA_EPS + cv2.TERM_CRITERIA_MAX_ITER, 10, 1.0)
flags = cv2.KMEANS_RANDOM_CENTERS
compactness, labels, centers = cv2.kmeans(data, number_clusters, None, criteria, 10, flags)
# print(centers)

font = cv2.FONT_HERSHEY_SIMPLEX
bars = []
rgb_values = []

for index, row in enumerate(centers):
    bar, rgb = create_bar(200, 200, row)
    bars.append(bar)
    rgb_values.append(rgb)

img_bar = np.hstack(bars)

for index, row in enumerate(rgb_values):
    image = cv2.putText(img_bar, f'{index + 1}. RGB: {row}', (5 + 200 * index, 200 - 10),
                        font, 0.5, (255, 0, 0), 1, cv2.LINE_AA)
    print(f'{index + 1}. RGB{row}')

cv2.imshow('Image', img)
cv2.imshow('Dominant colors', img_bar)
# cv2.imwrite('output/bar.jpg', img_bar)

cv2.waitKey(0)
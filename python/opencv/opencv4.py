import cv2

img = cv2.imread(r'C:\Edu\coding\images and vijeos\download.jpg')
cv2.imshow('image', img)

gray_img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)  # Corrected color conversion code
cv2.imshow('image2', gray_img)
cv2.waitKey(0)

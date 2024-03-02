import cv2
import numpy as np

blank = np.zeros((500, 500, 3), dtype='uint8')
cv2.imshow('image', blank)

# blank[200:300, 300:400] = 0, 225, 225
# cv2.imshow('yello Image', blank)



cv2.rectangle(blank, (0,0), (blank.shape[1]//2, blank.shape[0]//2), (225, 225, 0), thickness=cv2.FILLED)
cv2.imshow('rectangle', blank)

cv2.waitKey(0)

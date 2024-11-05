import cv2

# img = cv2.imread('C:\Edu\coding\images and vijeos\download.jpg')

# cv2.imshow('down', img)

# cv2.waitKey(0)

cap = cv2.VideoCapture('C:\Edu\coding\images and vijeos\youtube 11.avi')

while True:
    isTrue, frame = cap.read()
    cv2.imshow('frame', frame)

    if cv2.waitKey(20) and 0xFF == ord('q'):
        break

cv2.waitKey(0)
import cv2

cap = cv2.VideoCapture(0)

while True:
    isTrue, frame = cap.read()
    cv2.imshow('frame', frame)
    if cv2.waitKey(0) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()

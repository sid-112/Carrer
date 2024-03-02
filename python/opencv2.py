import cv2

def resize(frame, scale=0.75):
    width = int(frame.shape[1] * scale)
    height = int(frame.shape[0] * scale)
    dimensions = (width, height)
    return cv2.resize(frame, dimensions, interpolation=cv2.INTER_AREA)

cap = cv2.VideoCapture(0)

key = 14
key_put = int(input('ENTER THE PASSWORD'))

if key == key_put:
    while True:
        isTrue, frame = cap.read()

        frame_resized = resize(frame)

        cv2.imshow('camera', frame)
        cv2.imshow('resized', frame_resized)

        if cv2.waitKey(20) & 0xFF == ord('q'):
            break
else:
    print('ACCESS DENIED')
cap.release()
cv2.destroyAllWindows()

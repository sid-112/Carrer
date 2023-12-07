print("Welcome to lottery")
print("Choose Number 7")
x = int(input())

if x == 0:
    print("Enter 7 ")
elif x == 7:
    print("Write any number from 0 to 10")
else:
    print("Enter 7")

y = int(input())
l = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

if int(y) == l[3]:
    print("Congrats you won a lottery")
    print("Contact on +91 9583048395")
else:
    print("Better luck next time")
    
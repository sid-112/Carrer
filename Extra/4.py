a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
f = int(input())

g = a + b + c
h = d + e + f

print(g)
print(h)

i = g * 1/100
j = h * 1/100

print(i)
print(j)

if i > j or i < j:
    print(i or j)
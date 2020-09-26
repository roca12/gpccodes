import random

mipila = []
n = 5
for i in range(n):
    mipila.append(random.randint(0, 100))
while(len(mipila) != 0):
    print(mipila.pop())
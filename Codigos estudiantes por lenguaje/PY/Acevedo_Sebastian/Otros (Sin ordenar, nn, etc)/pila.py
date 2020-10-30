from random import randint

pila = []

for i in range(10):
    num = randint(0,100)
    print(num)
    pila.append(num)

print('-'*20)

while len(pila) != 0:
    print(pila.pop())

vector = []
for i in range(10):
    vector.append(i)

for i in vector:
    print(i)

# Lista de listas 3X4
import random as rd
matrix = []
for i in range(3):
    matrix.append([])

for i in matrix:
    for j in range(4):
        i.append(rd.randint(1,100))

print(matrix)

# Mejor impreso

import random as rd
matrix = []
for i in range(3):
    matrix.append([])

for i in matrix:
    for j in range(4):
        i.append(rd.randint(1,100))

for i in matrix:
    print(i)
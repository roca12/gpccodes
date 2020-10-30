from collections import deque

listaDobleLazo = deque()

for i in range(20):
    if i % 2 == 0:
        listaDobleLazo.appendleft(i)
    else:
        listaDobleLazo.append(i)

for i in listaDobleLazo:
    print(i, end=' ')

"""
from sys import stdin,stdout
from collections import deque

listadoblelazo = deque()

for i in range(20):
    listadoblelazo.appendleft(i) if not i%2 else listadoblelazo.append(i)

for i in listadoblelazo:
    stdout.write(f"{i} ")
"""

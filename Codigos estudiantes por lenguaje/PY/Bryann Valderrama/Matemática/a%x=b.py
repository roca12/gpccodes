import math
from sys import stdout
wr = stdout.write


def modEquation(a, b):
    if a < b:
        wr(f'No hay Solucion')
        return
    if a == b:
        wr(f'Infinitas Soluciones')
    cont = 0
    n = a - b
    y = int(math.sqrt(a-b))
    for i in range(1, y+1):
        if n % i == 0:
            if n // i > b:
                cont += 1
                wr(f'{n//i}\n')
            if i > b:
                cont += 1
                wr(f'{i}\n')
    if y*y == n and y > b:
        cont -= 1
    wr(f'{cont}')


a = 21
b = 5
modEquation(a, b)

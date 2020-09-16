'''
Dadas 2 coordenadas y m:n, encuentre las coordenadas
que dividen la línea juntando (x1,y1) y (x2,y2) en el 
ratio
'''
from collections import namedtuple
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


# Usando coordenadas independientes
def section(x1, y1, x2, y2, m, n):
    x = ((n * x1) + (m * x2)) / (m + n)
    y = ((n * y1) + (m * y2)) / (m + n)
    wr(f'({x} , {y})')


x1, y1, x2, y2, m, n = rl().strip().split()
x1, y1, x2, y2, m, n = int(x1), int(y1), int(x2), int(y2), int(m), int(n)
section(x1, y1, x2, y2, m, n)


# Usando NamedTuple
Puntos = namedtuple('Puntos', ['x', 'y'])


def sectionNT(P1, P2, m, n):
    x = ((n * P1.x) + (m * P2.x)) / (m + n)
    y = ((n * P1.y) + (m * P2.y)) / (m + n)
    wr(f'({x} , {y})')


P1 = Puntos(x1, y1)
P2 = Puntos(x2, y2)
sectionNT(P1, P2, m, n)

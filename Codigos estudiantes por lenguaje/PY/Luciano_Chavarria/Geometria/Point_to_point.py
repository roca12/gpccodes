from sys import stdin, stdout
from collections import namedtuple

Punto = namedtuple("Point", "x,y")


def lineFromPoints(p, q):
    a = q.y - p.y
    b = p.x - q.x
    c = a * (p.x) + b * (p.y)
    if b < 0:
        stdout.write(f"la linea que pasa a traves de los puntos P y Q es: {a}x + {b}y = {c}")

p = Punto(0, 0)
q = Punto(5, 5)

lineFromPoints(p, q)

from sys import stdin, stdout
from collections import namedtuple

Punto = namedtuple("Point", "x,y")


def section(p, q, m, n):
    x = ((n * p.x) + (m * q.x)) / (m + n)
    y = ((n * p.y) + (m * q.y)) / (m + n)
    stdout.write(f"({x},{y})")


p = Punto(2, 0)
q = Punto(5, 5)
m, n = 3, 2

section(p, q, m, n)

import math
from sys import stdout, stdin
wr = stdout.write


def degToRad(d):
    return d * math.pi / 180


def radToDeg(r):
    return r * 180 / math.pi


wr(f'{degToRad(360)}\n')
wr(f'{radToDeg(6.283185307179586)}\n')

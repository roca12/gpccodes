from sys import stdin, stdout
import math
rl = stdin.readline
wr = stdout.write


def area_circumscribed(a):
    return (a * a * (math.pi / 3))


a = int(rl())
wr(f'Area de circulo circunscrito: {area_circumscribed(a)}')

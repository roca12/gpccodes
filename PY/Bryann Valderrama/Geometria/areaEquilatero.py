from sys import stdin, stdout
import math
rl = stdin.readline
wr = stdout.write


def areaEquilatero(lado):
    return (a * a * (math.pi) / 3)


a = int(rl())
wr(f'{areaEquilatero(a)}')

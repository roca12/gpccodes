'''
Hallar el minimo perimetro de una figura usando bloques
'''

import math
from collections import namedtuple
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def minPerimeter(n):
    l = int(math.sqrt(n))
    sq = l * l
    if sq == n:
        return l * 4
    else:
        row = n // l
        perimeter = 2 * (l + row)
        if n % l != 0:
            perimeter += 2
        return perimeter


n = int(rl())
wr(f'{minPerimeter(n)}')

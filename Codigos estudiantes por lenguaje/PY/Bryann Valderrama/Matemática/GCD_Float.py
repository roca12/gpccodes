'''Maximo Comun Divisor en numeros flotantes
'''

from sys import stdout
from math import floor
wr = stdout.write


def GCD(a, b):
    if a < b:
        return GCD(b, a)
    if abs(b) < 0.001:
        return a
    else:
        return GCD(b, a - floor(a/b) * b)


a = 1.20
b = 22.5
wr(f'{GCD(a, b):.2f}\n')

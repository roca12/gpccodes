'''
Maximo Comun Divisor - Greatest Common Factor (GCD)
   - Mayor numero entero que divide a 2 numeros sin dejar residuo 

Minimo Comun Multiplo - Least Common Multiple (LCM)
   - Menor multiplo comun de 2 numeros
'''

from sys import stdout
from math import gcd, lcm
wr = stdout.write


def GCD(a, b):
    return a if b == 0 else GCD(b, a % b)


def LCM(a, b):
    return a * (b // GCD(a, b))


a = 60
b = 70
wr(f'GCD: {GCD(a, b)}\n')
wr(f'LCM: {LCM(a, b)}\n')

wr(f'{gcd(a, b)}\n')
wr(f'{lcm(a, b)}\n')

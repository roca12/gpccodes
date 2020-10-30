'''
Maximo Comun Divisor - Greatest Common Factor (GCD)
   - Mayor numero entero que divide a n numeros sin dejar residuo 

Minimo Comun Multiplo - Least Common Multiple (LCM)
   - Menor multiplo comun de n numeros
'''

from sys import stdout
wr = stdout.write


def GCD(a, b):
    return a if b == 0 else GCD(b, a % b)


def LCM(a, b):
    return a * (b // GCD(a, b))


a = 60
b = 70
wr(f'GCD: {GCD(a, b)}\n')
wr(f'LCM: {LCM(a, b)}\n')

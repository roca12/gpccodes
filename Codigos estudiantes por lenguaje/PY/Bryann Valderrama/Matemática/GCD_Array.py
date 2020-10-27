'''Maximo Comun Divisor entre N numeros
'''

from sys import stdout
from functools import reduce
wr = stdout.write


def GCD(a, b):
    return b if a == 0 else GCD(b % a, a)


def findGCD(arr, n):
    res = arr[0]
    for i in range(n):
        res = GCD(arr[i], res)
    return res


arr = [64, 8, 16]
wr(f'{findGCD(arr, len(arr))}\n')
wr(f'{reduce(GCD, arr)}\n')  # Con Reduce

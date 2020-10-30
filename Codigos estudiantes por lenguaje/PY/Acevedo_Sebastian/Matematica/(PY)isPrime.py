'''Primaly Test

   - Se saca la raiz cuadrada entera de N
   - Se realiza N.mod(i) desde 2 hasta la raiz, 
   - Si algun i es divisible, No es primo.
   - Si ningun i es divisible, Si es Primo.
'''

from sys import stdout
wr = stdout.write

def isPrime(x):

    if x < 2:
        return False
    if x == 2:
        return True

    i = 2
    while i * i <= x:
        if x % i == 0:
            return False
        i += 1

    return True


n = 523
wr('Es primo') if isPrime(n) else wr('No es Primo')

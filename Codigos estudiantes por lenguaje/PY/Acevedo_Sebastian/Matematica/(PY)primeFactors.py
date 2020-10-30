'''Prime Factors
   - Numeros Primos divisores exactos de un numero N
'''

from sys import stdout
wr = stdout.write


def primeFactors(n):

    i = 2
    while i * i <= n:
        while n % i == 0:
            wr(f'{i}\n')
            n //= i
        i += 1

    if n > 1:
        wr(f'{n}\n')


n = 100
primeFactors(n)

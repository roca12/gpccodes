'''N Fibonacci y su ultimo Digito

   - Encontrar el N Fibonacci con su ultimo digito
   - Tiene limitacion con numeros muy grandes
   - La serie de Fibonacci tiene una secuencia en su ultimo digito
   - Cada 60 numeros se repite una y otra vez
   - Complejidad Tiempo: O(Log n)
'''

from sys import stdout
wr = stdout.write


def multiply(F, M):
    x = F[0][0] * M[0][0] + F[0][1] * M[1][0]
    y = F[0][0] * M[0][1] + F[0][1] * M[1][1]
    z = F[1][0] * M[0][0] + F[1][1] * M[1][0]
    w = F[1][0] * M[0][1] + F[1][1] * M[1][1]

    F[0][0] = x
    F[0][1] = y
    F[1][0] = z
    F[1][1] = w


def power(F, n):
    if n == 0 or n == 1:
        return

    M = [[1, 1], [1, 0]]
    power(F, n//2)
    multiply(F, F)

    if n % 2 != 0:
        multiply(F, M)


def fib(n):
    F = [[1, 1], [1, 0]]
    if n == 0:
        return 0
    power(F, n-1)
    return F[0][0]


def findLastDigit(n):
    return fib(n) % 10


n = 100
wr(f'{fib(n)}\n')
wr(f'{findLastDigit(n)}\n')

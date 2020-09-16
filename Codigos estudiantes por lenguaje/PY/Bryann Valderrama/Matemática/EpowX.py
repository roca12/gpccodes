from sys import stdout
wr = stdout.write


def exp(n, x):
    suma = 1
    for i in range(n-1, 0, -1):
        suma = 1 + x * suma / i
    return suma


n = 10
x = 2
wr(f'exp = {exp(n,x)}\n')
wr(f'exp = {exp(n+10,x)}')

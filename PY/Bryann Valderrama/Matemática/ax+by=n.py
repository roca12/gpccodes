from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def solution(a, b, n):
    i = 0
    while i * a <= n:
        if (n - (i * a)) % b == 0:
            wr(f'x = {i}, y = {(n-(i*a))//b}')
            return
        i += 1
    wr(f'Sin solucion')


a = 2
b = 3
n = 7
solution(a, b, n)

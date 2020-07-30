from sys import stdout
wr = stdout.write


def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n-1)


res = 5
wr(f'{factorial(res)}')

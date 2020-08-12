from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def gcd(a, b):
    if b == 0 or a == 0:
        return a
    if a == 0:
        return b
    if (a & 1 == 0) and (b & 1 == 0):
        return gcd(a >> 1, b >> 1) << 1
    if (a & 1 == 0) and (b & 1 != 0):
        return gcd(a >> 1, b)
    if (a & 1 != 0) and (b & 1 == 0):
        return gcd(a, b >> 1)
    return gcd(a - b, b) if a > b else gcd(a, b - a)


wr(f'{gcd(50,10)}')

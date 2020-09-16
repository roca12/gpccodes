from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def RP(a, b):
    res = 0
    while b > 0:
        if b & 1 != 0:
            res += a
        a <<= 1
        b >>= 1
    return res


a, b = int(rl()), int(rl())
wr(f'{RP(a, b)}')

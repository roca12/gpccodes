from sys import stdout, stdin


def get_next(n):
    c = n
    c0 = 0
    c1 = 0
    while (c & 1 == 0) and c != 0:
        c0 += 1
        c >>= 1
    while (c & 1 == 1):
        c1 += 1
        c >>= 1
    if (c0 + c1 == 31) or c0 + c1 == 0:
        return -1
    p = c0 + c1
    n |= (1 << p)
    n &= ~((1 << p) - 1)
    n |= (1 << (c1 - 1)) - 1
    return n

n = 5
stdout.write(f"{n} -> {bin(n)[2:]} -> {get_next(n)}")

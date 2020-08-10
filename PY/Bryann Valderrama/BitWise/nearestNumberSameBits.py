from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def getNext(n):
    c = n
    c0 = 0
    c1 = 0
    while (c & 1 == 0) and (c != 0):
        c0 += 1
        c >>= 1
    while (c & 1) == 1:
        c1 += 1
        c >>= 1
    if (c0 + c1 == 31) or (c0 + c1 == 0):
        return -1
    p = c0 + c1
    # Mascaras de Bits
    n |= (1 << p)
    n &= ~((1 << p)-1)
    n |= (1 << (c1-1))-1
    return n


def getPrev(n):
    temp = n
    c0 = 0
    c1 = 0
    while (temp & 1) == 1:
        c1 += 1
        temp = temp >> 1
    if temp == 0:
        return -1
    while (temp & 1 == 0) and (temp != 0):
        c0 += 1
        temp = temp >> 1
    p = c0 + c1
    n &= ((~0) << (p + 1))
    mask = (1 << (c1 + 1)) - 1
    n |= mask << (c0 - 1)
    return n


n = int(rl())
wr(f'{n} -> {bin(n)[2:]}\n')
wr(f'{getNext(n)} -> {bin(getNext(n))[2:]}\n')
wr(f'{getPrev(n)} -> {bin(getPrev(n))[2:]}')

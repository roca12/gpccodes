from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def flipBit(a):
    if ~a == 0:
        return 8 * sizeof()
    currlen, prevlen, maxlen = 0, 0, 0
    while a != 0:
        if a & 1 == 1:  # Cambiar a 0
            currlen += 1
        elif a & 1 == 0:  # Cambiar a 1
            prevlen = 0 if ((a & 2) == 0) else currlen
            currlen = 0
        maxlen = max(prevlen + currlen, maxlen)
        a >>= 1
    return maxlen + 1


def sizeof():
    sizeOfInteger = 8
    return sizeOfInteger

a = int(rl())
wr(f'{a} -> {bin(a)[2:]}\n')
wr(f'{flipBit(a)}')

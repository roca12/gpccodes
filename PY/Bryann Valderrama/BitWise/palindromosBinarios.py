from sys import stdin, stdout, maxsize
rl = stdin.readline
wr = stdout.write


def iskthBitSet(x, k):
    return 1 if (x & (1 << (k-1))) > 0 else 0


def leftMostSetBit(x):
    cont = 0
    while x > 0:
        cont += 1
        x = x >> 1
    return cont


def isBinPal(x):
    l = leftMostSetBit(x)
    r = 1
    while l > r:
        if iskthBitSet(x, 1) != iskthBitSet(x, r):
            return 0
        l -= 1
        r += 1
    return 1


def findNthPal(n):
    pal_cont = 0
    i = 0
    for i in range(maxsize):
        if isBinPal(i) > 0:
            pal_cont += 1
        if pal_cont == n:
            break
    return i


string = rl()
n = int(string, 16)
res = findNthPal(n)
wr(f'{res} -> {bin(res)[2:]}')

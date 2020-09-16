from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def countSetBit(n):
    bitcount = 0
    for i in range(1, n+1):
        wr(f'{i} -> {bin(i)[2:]}\n')
        bitcount += countSetBitsUtil(i)
    return bitcount


def countSetBitsUtil(x):
    if x <= 0:
        return 0
    return (0 if (x & 1 == 0) else 1) + countSetBitsUtil(x//2)


n = 5
wr(f'{countSetBit(n)}')

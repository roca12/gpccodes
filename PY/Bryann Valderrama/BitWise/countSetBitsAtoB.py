from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def countSetBits(n):
    count = 0
    while n != 0:
        count += n & 1
        n >>= 1
    return count


def flipperCount(a, b):
    return countSetBits(a ^ b)


a = 50
b = 100
wr(f'{a} -> {bin(a)[2:]}\n')
wr(f'{b} -> {bin(b)[2:]}\n')
wr(f'{flipperCount(a,b)}')

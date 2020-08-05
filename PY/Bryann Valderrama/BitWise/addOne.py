from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def addOne(n):
    # 0011
    # 0000
    # 0100
    wr(f'{n} -> {bin(n)[2:]}\n')
    n = (-(~n))
    wr(f'{n} -> {bin(n)[2:]}\n')


n = int(rl())
addOne(n)

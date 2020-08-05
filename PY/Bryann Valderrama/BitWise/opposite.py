from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def opposite(n, m):
    res = (n ^ m) < 0
    if res:
        wr(f'Distintos\n')
    else:
        wr(f'Iguales\n')


n = 30
m = -100
opposite(n, m)

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def square(n):
    if n == 0:
        return 0
    if n < 0:
        n = -n
    x = n >> 1
    if n & 1:
        return (square(x) << 2)+(x << 2)+1
    else:
        return (square(x) << 2)


for i in range(11):
    wr(f'{i} -> {square(i)}\n')

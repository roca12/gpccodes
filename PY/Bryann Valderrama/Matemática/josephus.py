from sys import stdout
wr = stdout.write


def next_(a, k, d):
    j = a - 1
    i = 0
    while i < k:
        j = (j+1) % len(d)
        if d[j] != -1:
            i += 1
    wr(f'Next = {j}\n')
    return j


def josephus(n, k):
    d = [-1 for x in range(n+1)]
    d[0] = -1
    for i in range(1, n+1):
        d[i] = i
    i = n
    a = 0
    while i != 1:
        i -= 1
        a = next_(a, k, d)
        d[a] = -1
        a += 1
    i = 0
    while d[i] == -1:
        i += 1
    return d[i]


def josephusModular(n, k):
    f = 0
    for i in range(1, n+1):
        f = (f+k) % i
    return f + 1


wr(f'{josephusModular(6,2)}\n')
wr(f'{josephus(6,2)}')

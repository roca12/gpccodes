from sys import stdin, stdout
wr = stdout.write
rl = stdin.readline

for i in range(int(input())):
    t1 = 0
    t2 = 0
    t3 = 0
    n = int(rl())
    l = [int(x) for x in input().split()]
    for i in l:
        if i in [1, 2]:
            t1 += 1
        if i in [3, 4]:
            t2 += 1
        if i in [5, 6]:
            t3 += 1
    wr(f'TYPE 1 - {t1}\n')
    wr(f'TYPE 2 - {t2}\n')
    wr(f'TYPE 3 - {t3}\n')

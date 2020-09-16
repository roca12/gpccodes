from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def multiplyZero(n):
    res = (n << 0) - n
    wr(f'{n} x 0 = {res}\n')


def multiplyOne(n):
    res = (n << 1) - n
    wr(f'{n} x 1 = {res}\n')


def multiplyTwo(n):
    res = (n << 1)
    wr(f'{n} x 2 = {res}\n')


def multiplyThree(n):
    res = (n << 1)+n
    wr(f'{n} x 3 = {res}\n')


def multiplyFour(n):
    res = (n << 2)
    wr(f'{n} x 4 = {res}\n')


def multiplyFive(n):
    res = (n << 2)+n
    wr(f'{n} x 5 = {res}\n')


def multiplySix(n):
    res = (n << 3)-(n << 1)
    wr(f'{n} x 6 = {res}\n')


def multiplySeven(n):
    res = (n << 3)-n
    wr(f'{n} x 7 = {res}\n')


def multiplyEight(n):
    res = (n << 3)
    wr(f'{n} x 8 = {res}\n')


def multiplyNine(n):
    res = (n << 3)+n
    wr(f'{n} x 9 = {res}\n')


def multiplyTen(n):
    res = (n << 3)+(n << 1)
    wr(f'{n} x 10 = {res}\n')


n = int(rl())
multiplyZero(n)
multiplyOne(n)
multiplyTwo(n)
multiplyThree(n)
multiplyFour(n)
multiplyFive(n)
multiplySix(n)
multiplySeven(n)
multiplyEight(n)
multiplyNine(n)
multiplyTen(n)

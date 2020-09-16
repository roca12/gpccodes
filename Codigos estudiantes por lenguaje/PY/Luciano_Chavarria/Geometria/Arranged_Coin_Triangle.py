from sys import stdin, stdout


def findMaxH(n):
    n1 = 1 + 8 * n
    maxh = int(-1 + squareRoot(n1) / 2)
    return maxh


def squareRoot(n):
    x = n
    y = 1
    e = 0.000001
    while x - y > e:
        x = (x + y) / 2
        y = n / x
    return x

N = 12

stdout.write(f"{findMaxH(N)}")

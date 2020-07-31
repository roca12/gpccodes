from sys import stdout
wr = stdout.write


def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)


def phi(n):
    result = 1
    for i in range(2, n):
        if gcd(i, n) == 1:
            result += 1
    return result


for i in range(1, 11):
    wr(f'Phi ({i}) = {phi(i)}\n')

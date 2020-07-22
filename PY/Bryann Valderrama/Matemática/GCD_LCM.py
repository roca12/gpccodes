from sys import stdout


def GCD(a, b):
    return a if b == 0 else GCD(b, a % b)


def LCM(a, b):
    return a * (b // GCD(a, b))


a = 8
b = 53
stdout.write(f'GCD de a y b = {GCD(a,b)}\n')
stdout.write(f'LCM de a y b = {LCM(a,b)}')

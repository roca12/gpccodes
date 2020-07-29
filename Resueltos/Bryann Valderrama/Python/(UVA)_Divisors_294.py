from sys import stdout


def divisors(x):
    nDiv = 1
    i = 2
    while i*i <= x:
        cnt = 0
        while x % i == 0:
            cnt += 1
            x //= i
        nDiv *= cnt + 1
        i += 1
    if x > 1:
        nDiv *= 2
    return nDiv


for i in range(int(input())):
    l = {}
    linea = input()
    a, b = linea.split()
    a, b = int(a), int(b)
    for i in range(a, b+1):
        l[i] = divisors(i)
    stdout.write(f'Between {a} and {b}, {max(l, key=lambda k: l[k])} has a maximum of {max(l.values())} divisors.\n')

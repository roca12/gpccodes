from sys import stdout


def divisors(x):
    nDiv = 1
    i = 2
    while i**2 <= x:
        cnt = 0
        while x % i == 0:
            cnt += 1
            x //= i
        nDiv *= cnt + 1
        i += 1
    if x > 1:
        nDiv *= 2
    return nDiv

stdout.write(str(divisors(10)))

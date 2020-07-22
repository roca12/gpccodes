from sys import stdout


def isPrime(x):
    if x < 2:
        return False
    if x == 2:
        return True
    i = 2
    while i * i <= x:
        if x % i == 0:
            return False
        i += 1
    return True


n = 14
if isPrime(n):
    stdout.write('Es Primo')
else:
    stdout.write('No es Primo')

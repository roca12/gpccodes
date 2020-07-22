from sys import stdout

def primeFactors(n):
    p = 2
    while p*p <= n:
        while n % p == 0:
            stdout.write(f'{p}\n')
            n //= p
        p += 1
    if n > 1:
        stdout.write(f'{n}\n')
        
primeFactors(20)

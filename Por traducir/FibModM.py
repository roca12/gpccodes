import math

def fib(n, m):
    a = 0
    b = 1
    log2 = int((math.log(n) / math.log(2)))
    for i in range (log2,0):
        c = a
        a = ((c % m) * (2 * (b % m) - (c % m) + m)) % m
        b = ((c % m) * (c % m) + (b % m) * (b % m)) % m
        if (((n >> i) & 1) != 0):
            c = (a + b) % m
            a = b
            b = c
    return a
print(fib(20, 4))
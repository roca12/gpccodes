def modmul(a,b,mod):
    x = 0;
    y = a % mod;
    while (b > 0):
        if (b % 2 == 1):
            x = (x + y) % mod;
        y = (y << 1) % mod
        b >>= 1
    return x % mod


def modpow(a, b, mod):
    if (b == 0):
        return 1
    if (b % 2 == 0):
        temp = modpow(a, b / 2, mod)
        return (temp * temp) % mod
    else:
        temp = modpow(a, b - 1, mod)
        return (temp * a) % mod;
    
def isPrime(p):
    if (p < 2 or (p != 2 and p % 2 == 0)):
        return False
    s = p - 1
    while (s % 2 == 0):
        s /= 2
    for i in range (5):
        a = int((0.5 * p) % (p - 1) + 1)
        temp = s
        mod = modpow(a, temp, p)
        while (temp != p - 1 and mod != 1 and mod != p - 1):
            mod = modmul(mod, mod, p)
            temp *= 2
        if (mod != p - 1 and temp % 2 == 0):
            return False
    return True
for i in range (100):
    print(str(i) +" "+str(isPrime(i)))
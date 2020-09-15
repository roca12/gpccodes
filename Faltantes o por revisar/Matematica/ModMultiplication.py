
def modmul(a, b, mod):
    x = 0
    y = a % mod
    while (b > 0):
        if (b % 2 == 1):
            x = (x + y) % mod
        y = (y << 1) % mod;
        b >>= 1;
    return x % mod;
print(modmul(2, 2, 2))
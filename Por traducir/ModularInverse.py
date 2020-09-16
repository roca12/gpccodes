
def extendedEuclid(a,b):
    if (b == 0):
        x = 1;
        y = 0;
        return a
    
    d = extendedEuclid(b, a % b)
    aux = x
    x = y
    y = aux - ((a / b) * y)
    return d

def modInverse1(a, mod):
    d = extendedEuclid(a, mod)
    if (d > 1):
        return -1;
    return (x % mod + mod) % mod;

def modInverse(mod):
    inv=[0 in range (mod)]
    inv[1] = 1;
    for i in range(2,mod):
        inv[i] = (mod - (mod / i) * inv[mod % i] % mod) % mod
x=0 
y=0

print(modInverse1(3, 7))
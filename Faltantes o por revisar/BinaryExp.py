def power(x,y, p):
    res = 1
    x = x % p
    if x == 0: 
        return 0
    while y > 0:
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res
x = 2
y = 5
p = 13
print(power(x, y, p))
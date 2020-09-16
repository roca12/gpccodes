def power(x,y,p):
    res = 1
    x = x % p
    while (y > 0):
        r = y & 1
        if (r == 1):
            res = (res * int (x)) % int(p)
        y = y >> 1
        x = (x * x) % p
    return res

def numberOfDigits(x):
    i = 0
    while (x != 0):
        x /= 10
        i+=1
    return i

def LastTwoDigit(n):
    print("Last " + str(2) +"digits of " + str(2) + "^"+str(n) + " = ")
    temp = 1
    for i in range (1,3):
        temp *= 10
    temp = power(2, n, temp)
    aux=(2 - numberOfDigits(temp))
    for i in range (aux):
        print( str(0) + " ")
    if (temp != 0):
        print(temp);
n=72
LastTwoDigit(n)
from sys import stdout,stdin

MAX = 2**32

def isKthBitSet(x,k):
    return (1 if (1 << (k-1)) > 0 else 0)

def leftmostSetBit(x):
    cont = 0
    while x:
        cont+=1
        x = x >> 1

    return cont

def isBinPal(x):
    l = leftmostSetBit(x)
    r = 1
    while l > r:
        if isKthBitSet(x, 1) != isKthBitSet(x, r):
            return 0
        l-=1
        r+=1
    return 1

def findNthPal(n):
    global MAX
    pal_cont = 0
    i = 0
    for i in range(MAX):
        if isBinPal(i) > 0:
            pal_cont+=1
        if pal_cont == n:
            break

    return i

str_ = stdin.readline()
n = int(str_,16)
res = findNthPal(n)
stdout.write(f"{res} -> {bin(res)[2:]}")

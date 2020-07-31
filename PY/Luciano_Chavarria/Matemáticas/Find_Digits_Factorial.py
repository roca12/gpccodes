from sys import stdout, stdin
import math


def finddigits(n):
    if n < 0:
        return 0
    if n <= 1:
        return 1
    digits = 0
    for i in range(2,n+1):
        digits += math.log10(i)
    return int(math.floor(digits) + 1)


stdout.write(f"{finddigits(5)}")

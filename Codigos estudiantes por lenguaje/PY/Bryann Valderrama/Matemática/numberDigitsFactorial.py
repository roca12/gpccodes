import math
from sys import stdout
wr = stdout.write


def findDigits(n):
    if n < 0:
        return 0
    if n <= 1:
        return 1
    digits = 0
    for i in range(2, n+1):
        digits += math.log10(i)
    return int(math.floor(digits)+1)


wr(f'{findDigits(1000000)}')

from sys import stdout, stdin
import math


def findDigits(n):
    if n < 0:
        return 0
    if n <= 1:
        return 1

    x = (n * math.log10(n / math.e)) + math.log10(2 * math.pi * n) / 2
    return int(math.floor(x) + 1)

stdout.write(f"{findDigits(5)}")

from sys import stdin, stdout
import math


def minPerimeter(n):
    l = int(math.sqrt(n))
    sq = l**2
    if sq == n:
        return 4 * l
    else:
        row = n // l
        perimeter = 2 * (l + row)
        if n % l != 0:
            perimeter += 2
        return perimeter


n = 10
stdout.write(f"{minPerimeter(n)}")

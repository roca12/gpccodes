from sys import stdin, stdout
import math

in_, out = stdin.readline, stdout.write


def cocktailSort(a=[]):
    swapped = True
    start = 0
    end = len(a)
    while swapped:
        swapped = False
        for i in range(start, end - 1):
            if a[i] > a[i + 1]:
                a[i], a[i + 1] = a[i + 1], a[i]
                swapped = True
        if not swapped:
            break
        swapped = False
        end -= 1
        for i in range(end - 1, start + 1, -1):
            if a[i] > a[i + 1]:
                a[i], a[i + 1] = a[i + 1], a[i]
                swapped = True
        start += 1

lista = list(map(int,in_().strip().split()))
print(*lista)
cocktailSort(lista)
print(*lista)

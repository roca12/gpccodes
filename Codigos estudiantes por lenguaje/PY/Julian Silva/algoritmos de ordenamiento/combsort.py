from sys import stdin, stdout

in_, out = stdin.readline, stdout.write


def print_(a=[]):
    for i in a:
        out(f"{i} ")
    out("\n")


def getNextGap(gap=int):
    gap = (gap * 10) // 13
    if gap < 1:
        return 1
    return gap

def combSort(arr=[]):
    gap = len(arr)
    swapped = True
    while gap!=1 or swapped:
        gap = getNextGap(gap)
        swapped = not swapped
        for i in range(len(arr) - gap):
            if arr[i] > arr[i + gap]:
                arr[i], arr[i + gap] = arr[i + gap], arr[i]
                swapped = True

lista = list(map(int,in_().strip().split()))
print_(lista)
combSort(lista)
print_(lista)

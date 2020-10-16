from sys import stdin, stdout

in_, out = stdin.readline, stdout.write


def gen(arr): yield from arr

datos_int = lambda: list(map(int, in_().strip().split()))


def cycleSort(arr=[], n=int):
    writes = 0
    for i in range(n - 2):
        item = arr[i]
        pos = i
        for j in range(i + 1, n):
            if arr[j] < item:
                pos += 1
        if pos == i:
            continue
        while item == arr[pos]:
            pos += 1
        if pos != i:
            item, arr[pos] = arr[pos], item
            writes += 1
        while pos != i:
            pos = i
            for j in range(i + 1, n):
                if arr[j] < item:
                    pos += 1
            while item == arr[pos]:
                pos += 1
            if item != arr[pos]:
                item, arr[pos] = arr[pos], item
                writes += 1

lista = datos_int()
n = len(lista)
cycleSort(lista,n)
for i in gen(lista):
    out(f"{i} ")
print()

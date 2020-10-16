from sys import stdin, stdout

in_, out = stdin.readline, stdout.write


def gen(arr): yield from arr

datos_int = lambda: list(map(int, in_().strip().split()))


def pigeonSort(arr, n):
    mn = arr[0]
    mx = arr[0]
    for k in range(n):
        if arr[k] > mx:
            mx = arr[k]
        if arr[k] < mn:
            mn = arr[k]
    range_ = mx - mn + 1
    phole = [0] * range_
    for i in range(n):
        phole[arr[i] - mn] += 1
    index = 0
    for j in range(range_):
        while phole[j]:
            arr[index] = j + mn
            index += 1
            phole[j] -= 1

lista = datos_int()
n = len(lista)
pigeonSort(lista,n)
for i in gen(lista):
    out(f"{i} ")
print()

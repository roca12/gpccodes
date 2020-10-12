from sys import stdin, stdout

in_, out = stdin.readline, stdout.write


def partition(arr=[], low=int, high=int):
    pivot = arr[high]
    i = (low - 1)
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1


def quicksort(arr=[], low=int, high=int):
    if low < high:
        pi = partition(arr, low, high)
        quicksort(arr, low, pi - 1)
        quicksort(arr, pi + 1, high)

mapa = list(map(int,in_().strip().split()))
out(f"{mapa}\n")
quicksort(mapa,0,len(mapa)-1)
out(f"{mapa}\n")

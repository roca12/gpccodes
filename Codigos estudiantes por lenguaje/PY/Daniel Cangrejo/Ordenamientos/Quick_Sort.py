
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def partition(arr=list, low=int, high=int):

    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]

    return i+1


def quickSort(arr=list, low=int, high=int):

    if low < high:
        piv = partition(arr, low, high)
        quickSort(arr, low, piv-1)
        quickSort(arr, piv+1, high)


arr = list(map(int, rl().split()))
quickSort(arr, 0, len(arr)-1)
print(*arr)

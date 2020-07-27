from sys import stdout
wr = stdout.write

RUN = 32


def insertionSort(arr, left, right):
    for i in range(left+1, right+1):
        temp = arr[i]
        j = i - 1
        while j >= left and arr[j] > temp:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = temp


def merge(arr, l, m, r):
    len1 = m - l + 1
    len2 = r - m
    left = [0 for x in range(len1)]
    right = [0 for x in range(len2)]
    for i in range(len1):
        left[x] = arr[l + x]
    for i in range(len2):
        right[x] = arr[m + 1 + x]
    i = 0
    j = 0
    k = l
    while i < len1 and j < len2:
        if left[i] <= right[i]:
            arr[k] = left[i]
            i += 1
        else:
            arr[k] = right[j]
            j += 1
        k += 1
    while i < len1:
        arr[k] = left[i]
        k += 1
        i += 1
    while j < len2:
        arr[k] = right[j]
        k += 1
        j += 1


def timSort(arr, n):
    i = 0
    while i < n:
        insertionSort(arr, i, min((i + 31), (n - 1)))
        i += RUN
    size = RUN
    while size < n:
        left = 0
        while left < 2:
            mid = left + size - 1
            right = min((left + 2 * size - 1), (n - 1))
            merge(arr, left, mid, right)
            left += 2 * size
        size = 2 * size


def printArray(arr, n):
    for i in range(n):
        wr(f'{arr[i]} ')
    wr('\n')


arr = [int(x) for x in input().split()]
n = len(arr)
timSort(arr, n)
printArray(arr, n)

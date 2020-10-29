from sys import stdin, stdout
from random import randint
rl = stdin.readline
wr = stdout.write


RUN = 32


def insertionSort(arr, left, right):

    for i in range(left+1, right+1):
        temp = arr[i]
        j = i - 1
        while arr[j] > temp and j >= left:
            arr[j+1] = arr[j]
            j -= 1
            if j < 0:
                break

        arr[j+1] = temp


def mergeSort(arr, left, mid, right):

    len1 = mid-left+1
    len2 = right-mid

    L = [0] * len1
    R = [0] * len2

    for x in range(len1):
        L[x] = arr[left+x]
    for x in range(len2):
        R[x] = arr[mid+1+x]

    i, j, k = 0, 0, left
    while i < len1 and j < len2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < len1:
        arr[k] = L[i]
        i += 1
        k += 1
    while j < len2:
        arr[k] = R[j]
        j += 1
        k += 1


def timSort(arr, n):

    i = 0
    while i < n:
        insertionSort(arr, i, min((i+31), (n-1)))
        size = RUN
        while size < n:
            left = 0
            while left < n:
                mid = min((left + size - 1), (n-1))
                right = min((left+2*size-1), (n-1))
                mergeSort(arr, left, mid, right)
                left += 2 * size
            size *= 2
        i += RUN


def printArray(arr, n):

    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
n = len(arr)
printArray(arr, n)
timSort(arr, n)
printArray(arr, n)

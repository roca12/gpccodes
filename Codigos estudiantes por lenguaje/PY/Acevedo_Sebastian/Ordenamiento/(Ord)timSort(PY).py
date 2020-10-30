'''Tim Sort

   - Usado en Java y Python.
   - Divide el arreglo en bloques dependiendo del RUN.
   - RUN: 32 a 64
   - Insertion Sort + Merge Sort.
   - Complejidad Tiempo: O(n log n).
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


RUN = 32


def insertionSort(arr=list, left=int, right=int):

    for i in range(left+1, right+1):
        temp = arr[i]
        j = i-1
        while arr[j] > temp and j >= left:
            arr[j+1] = arr[j]
            j -= 1
            if j < 0:
                break

        arr[j+1] = temp


def merge(arr=list, left=int, mid=int, right=int):

    len1 = mid-left+1
    len2 = right-mid

    L = [0] * len1
    R = [0] * len2

    for i in range(len1):
        L[i] = arr[left+i]
    for i in range(len2):
        R[i] = arr[mid+1+i]

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

def timSort(arr=list, n=int):

    i = 0
    while i < n:
        insertionSort(arr, i, min((i+31), (n-1)))
        size = RUN
        while size < n:
            left = 0
            while left < n:
                mid = left + size - 1
                right = min((left+2*size-1), (n-1))
                merge(arr, left, mid, right)
                left += 2 * size
            size *= 2
        i += RUN

def printArray(arr=list, n=int):

    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
n = len(arr)
printArray(arr, n)
timSort(arr, n)
printArray(arr, n)

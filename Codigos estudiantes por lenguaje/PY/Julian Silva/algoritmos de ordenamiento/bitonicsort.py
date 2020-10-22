from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def compAndSwap(arr, i, j, direc):
    if (arr[i] > arr[j] and direc == 1) or (arr[i] < arr[j] and direc == 0):
        arr[i], arr[j] = arr[j], arr[i]


def bitonicMerge(arr, low, cnt, direc):

    if cnt > 1:
        k = cnt // 2
        for i in range(low, low+k):
            compAndSwap(arr, i, i+k, direc)
            
        bitonicMerge(arr, low, k, direc)
        bitonicMerge(arr, low+k, k, direc)


def bitonicSort(arr, low, cnt, direc):

    if cnt > 1:
        k = cnt // 2
        bitonicSort(arr, low, k, 1)
        bitonicSort(arr, low+k, k, 0)
        bitonicMerge(arr, low, cnt, direc)


def sortB(arr, n, up):
    bitonicSort(arr, 0, n, up)


def printArray(arr):
    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
up = 1
printArray(arr)
sortB(arr, len(arr), up)
printArray(arr)
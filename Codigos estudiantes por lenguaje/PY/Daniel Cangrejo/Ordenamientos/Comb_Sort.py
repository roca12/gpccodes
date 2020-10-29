from sys import stdin,stdout
rl = stdin.readline
wr = stdout.write


def getNextGap(gap):
    gap = (gap * 10) // 13
    if gap < 1:
        return 1
    return gap


def combSort(arr, n):

    gap = n
    swapped = True
    
    while gap != 1 or swapped:
        gap = getNextGap(gap)
        swapped = False
        for i in range(n-gap):
            if arr[i] > arr[i+gap]:
                arr[i], arr[i+gap] = arr[i+gap], arr[i]
                swapped = True

    
arr = list(map(int, rl().split()))
combSort(arr, len(arr))
print(*arr)

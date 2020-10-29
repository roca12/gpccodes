from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def cocktailSort(arr):

    swapped = True
    start = 0
    end = len(arr)

    while swapped:  # Sort Izq a Der
        swapped = False
        for i in range(start, end-1):
            if arr[i] > arr[i+1]:  # Cambiar < o >
                arr[i], arr[i+1] = arr[i+1], arr[i]
                swapped = True
        if not swapped:
            break

    swapped = False
    end -= 1
    for i in range(end-1, start-1, -1):  # Sort Der a Izq
        if arr[i] > arr[i+1]:  # Cambiar < o >
            arr[i], arr[i+1] = arr[i+1], arr[i]
            swapped = True

    start += 1


def printArray(arr):
    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
printArray(arr)
cocktailSort(arr)
printArray(arr)

def getMax(arr, n):
    maxim = arr[0]
    for i in range(1, n):
        if(arr[i] > maxim):
            maxim = arr[i]
    return maxim


def countSort(arr, n, exp):
    output = [0 for x in range(n)]
    count = [0 for x in range(10)]
    i = 0
    for i in range(0, n):
        count[(arr[i]//exp) % 10] += 1
    for i in range(1, 10):
        count[i] += count[i-1]
    for i in range(n-1, -1, -1):
        output[count[(arr[i]//exp) % 10]-1] = arr[i]
        count[(arr[i]//exp) % 10] -= 1
    for i in range(0, n):
        arr[i] = output[i]


def radixSort(arr, n):
    m = getMax(arr, n)
    exp = 1
    while m//exp > 0:
        countSort(arr, n, exp)
        exp *= 10


lista = [int(x) for x in input().split()]
radixSort(lista, len(lista))
print(*lista)

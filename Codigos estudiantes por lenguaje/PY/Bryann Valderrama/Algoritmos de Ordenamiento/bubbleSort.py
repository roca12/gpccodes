def bubbleSort(arr, n):
    if (n == 1):
        return
    for i in range(0, n):
        for idx in range(0, n-1):
            if (arr[idx] > arr[idx+1]):
                temp = arr[idx]
                arr[idx] = arr[idx+1]
                arr[idx+1] = temp


lista = [int(x) for x in input().split()]
bubbleSort(lista, len(lista))
print(*lista)

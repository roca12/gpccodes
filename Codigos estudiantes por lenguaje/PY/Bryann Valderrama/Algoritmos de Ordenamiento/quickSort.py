def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if(arr[j] < pivot):
            i = i + 1
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    temp = arr[i+1]
    arr[i+1] = arr[high]
    arr[high] = temp
    return i+1


def quickSort(arr, low, high):
    if(low < high):
        pivot = partition(arr, low, high)
        quickSort(arr, low, pivot-1)
        quickSort(arr, pivot+1, high)


lista = [int(x) for x in input().split()]
quickSort(lista, 0, len(lista)-1)
print(*lista)

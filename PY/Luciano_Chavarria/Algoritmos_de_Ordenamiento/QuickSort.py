# -*- coding: cp1252 -*-

def Partition(arr, low, high):
    pivot = arr[high]
    i = low-1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1

def QuickSort(arr, low, high):
    if low < high:
        pivot = Partition(arr, low, high)
        QuickSort(arr, low, pivot-1)
        QuickSort(arr, pivot + 1, high)
        
    
if __name__ == "__main__":
    arr = [int(x) for x in input().split()]
    QuickSort(arr, 0, len(arr)-1)
    print(*arr)
    

# -*- coding: cp1252 -*-


def BubbleSort(arr, n):
    if n == 1:
        return
    for i in range(n-1):
        if arr[i] > arr[i + 1]:
            temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp
    BubbleSort(arr, n-1)
    
    
    
if __name__ == "__main__":
    arr = [4,5,8,9,10,2]
    BubbleSort(arr, len(arr))
    print(*arr)

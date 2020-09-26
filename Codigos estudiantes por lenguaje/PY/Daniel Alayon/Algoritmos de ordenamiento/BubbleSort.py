def bubbleSort(arr, n):
    if n == 1:
        return
    for i in range(n-1):
        if arr[i] > arr[i+1]:
            temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp
    bubbleSort(arr, n-1)


arr = [4, 5, 8, 9, 10, 2]
bubbleSort(arr, len(arr))
print(arr)

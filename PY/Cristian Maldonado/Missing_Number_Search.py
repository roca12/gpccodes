def getMissedNumber(arr, n):
    x1 = arr[0]
    x2 = 1
    for i in range(1, n):
        x1 = x1 ^ arr[i]
    for j in range(2, n+2):
        x2 = x2 ^ j
    return x1 ^ x2


arr = [1, 2, 3, 4, 5, 6, 8, 9, 10, 11]
missed = getMissedNumber(arr, len(arr))
print("El numero perdido es:", missed)

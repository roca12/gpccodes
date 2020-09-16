def minAbsSumPair(arr, n):
    if (n < 2):
        print("Array no tiene la cantidad de valores necesarios")
        return
    sum = 0
    min_x = 0
    min_r = 1
    min_sum = arr[0] + arr[1]
    for x in range(0, n):
        for r in range(x + 1, n):
            sum = arr[x] + arr[r]
            if (abs(min_sum) > abs(sum)):
                min_sum = sum
                min_x = x
                min_r = r
    print("Los dos elementos con la suma minima son: (" + str(arr[min_x]) + ", " + str(arr[min_r]) + ")")


arr = [1, 60, -10, 70, -80, 85]
minAbsSumPair(arr, len(arr))

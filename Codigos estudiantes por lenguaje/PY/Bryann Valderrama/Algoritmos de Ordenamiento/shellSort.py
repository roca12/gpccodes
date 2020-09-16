def ShellSort(arr):
    n = len(arr)
    grap = n // 2
    while grap > 0:
        i = grap
        while i < n:
            temp = arr[i]
            j = i
            while j >= grap and arr[j-grap] > temp:
                arr[j] = arr[j-grap]
                j -= grap
            arr[j]=temp
            i += 1
        grap //= 2
        
arr = [12,56,89,47,89,23]
ShellSort(arr)
print(*arr)

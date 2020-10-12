def merge(arr, left, mid, right):
    n1 = mid - left + 1
    n2 = right - mid
    L, R = [], []
    for i in range(n1):
        L.append(arr[left + i])
    for i in range(n2):
        R.append(arr[mid + 1 + i])
    i, j = int(0), int(0)
    k = left
    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1


def mergeSort(arr, left, right):
    if left < right:
        m = (left + right) // 2
        mergeSort(arr, left, m)
        mergeSort(arr, m + 1, right)
        merge(arr, left, m, right)

arr = [int(x) for x in input().split()]
mergeSort(arr, 0, len(arr) - 1)
print(arr)

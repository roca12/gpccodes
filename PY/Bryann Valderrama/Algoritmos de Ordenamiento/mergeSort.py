def merge(arr, izq, mid, der):
    n1 = mid-izq+1
    n2 = der-mid
    L = []
    R = []
    for i in range(n1):
        L.append(arr[izq+i])
    for i in range(n2):
        R.append(arr[mid + 1+i])
    i = int(0)
    j = int(0)
    k = izq
    while(i < n1 and j < n2):
        if(L[i] <= R[j]):
            arr[k] = L[i]
            i = i+1
        else:
            arr[k] = R[j]
            j = j+1
        k = k+1
    while(i < n1):
        arr[k] = L[i]
        i = i+1
        k = k+1
    while(j < n2):
        arr[k] = R[j]
        j = j+1
        k = k+1


def mergeSort(arr, izq, der):
    if(izq < der):
        mid = (izq + der) // 2
        mergeSort(arr, izq, mid)
        mergeSort(arr, mid+1, der)
        merge(arr, izq, mid, der)


lista = [int(x) for x in input().split()]
mergeSort(lista, 0, len(lista)-1)
print(*lista)

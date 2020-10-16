def BinarySearch(arr, inicio, fin, numerobuscado):
    if(fin >= inicio):
        medio = int(inicio + (fin - 1) / 2)
        if(arr[medio] == numerobuscado):
            return medio
        if(arr[medio] > numerobuscado):
            return BinarySearch(arr, inicio, medio - 1, numerobuscado)
        else:
            return BinarySearch(arr, medio + 1, fin, numerobuscado)
    return -1


def sort(arr=[]):
    for i in range(1, len(arr)):
        x = arr[i]
        k = i - 1
        j = abs(BinarySearch(arr, 0, i, x) + 1)
        while k >= j:
            arr[k+1] = arr[k]
            k-=1
        arr[k+1] = x

mapa = list(map(int,input().split()))
sort(mapa)
print(mapa)

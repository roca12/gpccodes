import math


def BinarySearch(arr, inicio, fin, numerobuscado):
    if(fin>=inicio):
        medio = int(inicio+(fin-1)/2)
        if(arr[medio] == numerobuscado):
            return medio
        if(arr[medio] > numerobuscado):
            return BinarySearch(arr,inicio,medio-1,numerobuscado)
        else:
            return BinarySearch(arr,medio+1,fin,numerobuscado)
    return -1



def exponentialSearch(lista,n,x):
    if lista[0]==x:
        return 0
    i = int(1)
    while i<n and lista[i]<=x:
        i*=2

    if n<i:
        return BinarySearch(lista, i // 2, n, x)
    else:
        return BinarySearch(lista, i // 2, i, x)

lista = [1,2,3,4,5]
x = int(4)
resultado = int(exponentialSearch(lista,len(lista),x))
if resultado < 0:
    print("Elemento no esta en la lista")
else:
    print("Elemento dentro de la lista en:",resultado)



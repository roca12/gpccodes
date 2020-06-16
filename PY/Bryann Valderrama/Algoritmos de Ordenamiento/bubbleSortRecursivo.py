def bubbleSort(arr, n):
    if (n == 1):
        return
    for i in range(0, n-1):
        if (arr[i] > arr[i+1]):
            temp = arr[i]
            arr[i] = arr[i+1]
            arr[i+1] = temp
    bubbleSort(arr, n-1)


# Ingresar datos en una lista en la entrada
lista = [int(x) for x in input().split()]
bubbleSort(lista, len(lista))
print(*lista)  # Imprimir lista sin , y []

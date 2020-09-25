def BinarySearch(arr, inicio, fin, numerobuscado):
    if fin >= inicio:
        medio = int(inicio + (fin - 1) / 2)
        if arr[medio] == numerobuscado:
            return medio
        if arr[medio] > numerobuscado:
            return BinarySearch(arr, inicio, medio-1, numerobuscado)
        else:
            return BinarySearch(arr, medio + 1, fin, numerobuscado)
    return -1


arr = [1, 2, 3, 4, 5, 6]

tam = len(arr)
numerobuscado = 5
resultado = int(BinarySearch(arr, 0, tam-1, numerobuscado))

if resultado == -1:
    print("Elemento no encontrado")
else:
    print("Elemento encontrado en la posicion: ", resultado)

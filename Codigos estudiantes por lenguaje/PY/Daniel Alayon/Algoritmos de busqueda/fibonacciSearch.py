def fibonacciSearch(arr, x, n):
    if (x > arr[n-1]):
        return -1
    Fm2 = 0
    Fm1 = 1
    Fms = Fm2 + Fm1
    while (Fms < n):
        Fm2 = Fm1
        Fm1 = Fms
        Fms = Fm2 + Fm1
    offset = -1
    while (Fms > 1):
        i = min((offset + Fm2), (n - 1))
        if (arr[i] < x):
            Fms = Fm1
            Fm1 = Fm2
            Fm2 = Fms - Fm1
            offset = i
        elif (arr[i] > x):
            Fms = Fm2
            Fm1 = Fm1 - Fm2
            Fm2 = Fms - Fm1
        else:
            return i
    if (Fm1 == 1 and arr[offset + 1] == x):
        return offset + 1
    return -1


arr = [10, 22, 33, 45, 89, 99, 100]
tam = len(arr)
buscado = 50
resultado = fibonacciSearch(arr, buscado, tam)
if (resultado == -1):
    print("Elemento no presente en el arreglo")
else:
    print("Elemento encontrado en la posicion", resultado)

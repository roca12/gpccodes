def binarySearch(arr, izq, der, numeroabuscar):
    if(der >= izq):
        medio = izq + (der-izq) // 2
        if(arr[medio] == numeroabuscar):
            return medio
        if (arr[medio] > numeroabuscar):
            return binarySearch(arr, izq, medio-1, numeroabuscar)
        else:
            return binarySearch(arr, medio+1, der, numeroabuscar)
    return -1


arr = [2, 3, 4, 5, 6]
numeroabuscar = int(input())
resultado = binarySearch(arr, 0, len(arr)-1, numeroabuscar)
if(resultado == -1):
    print('Elemento no encontrado')
else:
    print('Elemento encontrado en el indice', resultado)

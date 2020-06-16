def binarySearch(arr, inicio, fin, numeroabuscar):
    if(fin >= inicio):
        medio = int(inicio + (fin-1)/2)
        if(arr[medio] == numeroabuscar):
            return medio
        if (arr[medio] > numeroabuscar):
            return binarySearch(arr, inicio, medio-1, numeroabuscar)
        else:
            return binarySearch(arr, medio+1, fin, numeroabuscar)
    return -1


if __name__ == '__main__':
    arr = [2, 3, 4, 5, 6]
    tamanio = len(arr)
    numeroabuscar = 5
    resultado = int(binarySearch(arr, 0, tamanio-1, numeroabuscar))
    if(resultado == -1):
        print('Elemento no encontrado')
    else:
        print('Elemento encontrado en el indice', resultado)

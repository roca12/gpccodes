def binarySearch(arr, inicio, fin, numeroabuscar):
    if(fin > inicio):
        medio = int((inicio+(fin-1))/2)
        if(arr[medio] == numeroabuscar):
            return medio
        if(arr[medio] > numeroabuscar):
            return binarySearch(arr, inicio, medio-1, numeroabuscar)
        else:
            return binarySearch(arr, medio+1, fin, numeroabuscar)
    return -1


def exponentialSearch(arr, tam, numeroabuscar):
    if(arr[0] == numeroabuscar):
        return 0
    i = int(1)
    while (i < tam and arr[i] <= numeroabuscar):
        i = i*2
    return binarySearch(arr, i//2, min(i, tam), numeroabuscar)


if __name__ == '__main__':
    lista = [1, 2, 3, 4, 5, 6]
    tamanio = len(lista)
    numeroabuscar = int(6)
    resultado = int(exponentialSearch(lista, tamanio, numeroabuscar))
    if(resultado < 0):
        print("Elemento no presente")
    else:
        print("Elemento encuentrado en el indice:", resultado)

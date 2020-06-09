class Pair:
    min = int()
    max = int()


def getMaxMin(lista, n):
    minmax = Pair()
    i = int()
    if (n == 1):
        minmax.max = lista[0]
        minmax.max = lista[0]
        return minmax
    if (lista[0] > lista[1]):
        minmax.max = lista[0]
        minmax.min = lista[1]
    else:
        minmax.max = lista[1]
        minmax.min = lista[0]
    for i in range(2, n):
        if (lista[i] > minmax.max):
            minmax.max = lista[i]
        elif (lista[i] < minmax.min):
            minmax.min = lista[i]
    return minmax


if __name__ == '__main__':
    lista = [4, -1, 6, 23, 7, 78, 2]
    tamanio = int(len(lista))
    resultado = getMaxMin(lista, tamanio)
    print('El minimo es ', resultado.min)
    print('El maximo es ', resultado.max)

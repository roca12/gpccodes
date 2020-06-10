import math


def jumpSearch(lista, x):
    tamanio = len(lista)
    salto = int(math.floor(math.sqrt(tamanio)))
    previo = int(0)
    while(lista[min(salto, tamanio)-1] < x):
        previo = salto
        salto = salto + int(math.floor(math.sqrt(tamanio)))
        if(previo >= tamanio):
            return -1
    while(lista[previo] < x):
        previo = previo + 1
        if(previo == min(salto, tamanio)):
            return -1
    if(lista[previo] == x):
        return previo
    return -1


if __name__ == '__main__':
    lista = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
    numeroabuscar = int(input())
    resultado = jumpSearch(lista, numeroabuscar)
    if(resultado == -1):
        print('No encontrado')
    else:
        print('Encontrado en el indice ', resultado)

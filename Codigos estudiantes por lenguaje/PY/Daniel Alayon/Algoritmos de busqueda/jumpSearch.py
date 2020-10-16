import math


def jumpSearch(lista, x):
    tam = len(lista)
    salto = math.floor(math.sqrt(tam))
    previo = 0
    while lista[min(salto, tam) - 1] < x:
        previo = salto
        salto += math.floor(math.sqrt(tam))
        if previo >= tam:
            return -1
    while lista[previo] < x:
        previo += 1
        if previo >= tam:
            return -1
    while lista[previo] == x:
        return previo
    return -1


lista = [10, 20, 30, 40, 50, 60]
numeroBuscado = 10
resultado = jumpSearch(lista, numeroBuscado)
if resultado == -1:
    print("No encontrado")
else:
    print("Numero encopntrado en la posicion: ", resultado)

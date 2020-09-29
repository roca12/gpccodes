import math

def jumpSearch(lista, x):
    tam = len(lista)
    salto = int(math.floor(math.sqrt(tam)))
    previo = int(0)
    while(lista[min(salto, tam)-1] < x):
        previo = salto
        salto = salto + int(math.floor(math.sqrt(tam)))
        if(previo >= tam):
            return -1
    while(lista[previo] < x):
        previo = previo + 1
        if(previo == min(salto, tam)):
            return -1
    if(lista[previo] == x):
        return previo
    return -1
lsalt = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 139]
numbusqueda = int(input())
resultado = jumpSearch(lsalt, numbusqueda)
if(resultado == -1):
    print("No encontrado.")
else:
    print("Encontrado el indice ", resultado)

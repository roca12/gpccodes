def ternarySearch(izq, der, num, lista):
    if (der >= izq):
        mid1 = int(izq+(der-izq)/3)
        mid2 = int(der-(der-izq)/3)
        if (lista[mid1] == num):
            return mid1
        if (lista[mid2] == num):
            return mid2
        if (num < lista[mid1]):
            return ternarySearch(izq, mid1-1, num, lista)
        elif (num > lista[mid2]):
            return ternarySearch(mid2+1, der, num, lista)
        else:
            return ternarySearch(mid1+1, mid2-1, num, lista)
    return -1


if __name__ == '__main__':
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    izq = int(0)
    der = len(lista)-1
    numeroabuscar = int(input())
    resultado = ternarySearch(izq, der, numeroabuscar, lista)
    if(resultado == -1):
        print('El numero no esta en la lista')
    else:
        print(f'Encontrado en el indice {resultado}')

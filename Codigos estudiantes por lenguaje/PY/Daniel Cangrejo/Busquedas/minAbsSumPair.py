import math


def minAbsSumPair(lista, n):
    izq, der, min_sum, suma, min_izq, min_der = int(), int(), int(), int(), int(), int()
    if(n < 2):
        print('Array no tiene la cantidad de valores necesarios')
        return
    min_izq = int(0)
    min_der = int(0)
    min_sum = lista[0] + lista[1]
    for izq in range(n-1):
        for der in range(izq+1, n):
            suma = lista[izq] + lista[der]
            if(abs(min_sum) > abs(suma)):
                min_sum = suma
                min_izq = izq
                min_der = der
    print('Los 2 elementos los cuales tienen la suma minima son {} y {}'.format(
        lista[min_izq], lista[min_der]))


if __name__ == '__main__':
    lista = [1, 60, -10, 65, -43, 34]
    minAbsSumPair(lista, len(lista))

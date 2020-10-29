def minimo(x, y):
    if(x <= y):
        return x
    else:
        return y


def fibonacciSearch(lista, x, n):
    if(x > lista[n-1]):
        return -1

    fibo1 = int(0)
    fibo2 = int(1)
    fiboM = fibo1 + fibo2

    while(fiboM < n):
        fibo2 = fibo1
        fibo1 = fiboM
        fiboM = fibo2 + fibo1

    offset = int(-1)

    while(fiboM > 1):
        i = minimo(offset + fibo2, n-1)
        if(lista[i] < x):
            fiboM = fibo1
            fibo1 = fibo2
            fibo2 = fiboM - fibo1
            offset = i
        elif(lista[i] > x):
            fiboM = fibo2
            fibo1 = fibo1 - fibo2
            fibo2 = fiboM - fibo1
        else:
            return i

    if(fibo1 == 1 and lista[offset+1] == x):
        return offset + 1
    
    return -1


if __name__ == '__main__':
    lista = [10, 13, 15, 18, 24, 27, 39, 40, 45, 60, 79, 80, 90, 100]
    tamanio = len(lista)
    numeroabuscar = int(input())
    resultado = fibonacciSearch(lista, numeroabuscar, tamanio)
    if(resultado == -1):
        print('No encontrado')
    else:
        print('Encontrado en la posicion ', resultado)

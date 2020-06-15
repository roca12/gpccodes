def minimo(x, y):
 return min(x, y)

def fibonacciSearch(arr, x, n):
    if (x > arr[n-1]):
        return -1
    fib2 = 0
    fib1 = 1
    fibM = fib2 + fib1
    while (fibM < n):
        fib2 = fib1
        fib1 = fibM
        fibM = fib2 + fib1
    offset = -1
    while (fibM > 1):
        i = minimo(offset + fib2, n - 1)
        if (arr[i] < x):
            fibM = fib1
            fib1 = fib2
            fib2 = fibM - fib1
            offset = i
        elif (arr[i] > x):
            fibM = fib2
            fib1 = fib1 - fib2
            fib2 = fibM - fib1
        else:
            return i
    if (fib1 == 1 and arr[offset + 1] == x):
        return offset + 1
    return -1


arr = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
tam = len(arr)
buscado = 100
resultado = fibonacciSearch(arr, buscado, tam)
if (resultado < 0):
    print("Elemento no presente en el arreglo")
else:
    print("Elemento encontrado en la posicion", resultado)

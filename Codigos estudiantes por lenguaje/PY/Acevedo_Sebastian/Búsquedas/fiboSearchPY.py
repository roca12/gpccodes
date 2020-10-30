'''Fibonacci Search:
   - Va saltando según los números de Fibonacci.
   - El arreglo debe estar ordenado.
   - Entre mas grande es el arreglo, es mas efectivo.
   - Complejidad Tiempo: O(n log n).
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def _min(x, y):
    return x if x <= y else y


def fibonacci_Search(arr, x, n):

    fib2 = 0
    fib1 = 1
    fibM = fib2 + fib1

    while fibM < n:
        fib2 = fib1
        fib1 = fibM
        fibM = fib1 + fib2

    offset = -1
    while fibM > 1:
        i = _min(offset + fib2, n-1)
        if arr[i] < x:
            fibM = fib1
            fib1 = fib2
            fib2 = fibM - fib1
            offset = i
            # wr(f'{fibM}\n') # Print Statement
        elif arr[i] > x:
            fibM = fib2
            fib1 = fib1 - fib2
            fib2 = fibM - fib1
        else:
            return i

    if fib1 == 1 and arr[offset+1] == x:
        return offset+1

    return -1

arr = list(map(int, rl().split()))
x = int(rl())
result = fibonacci_Search(arr, x, len(arr))

if result == -1:
    wr('Dato no encontrado')
else:
    wr(f'Dato encontrado en la posicion {result}')

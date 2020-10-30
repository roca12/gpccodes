'''Exponencial Search
   - La búsqueda crece exponencialmente.
   - Útil para vectores dinámicos.
   - Complejidad Tiempo: O(log n).

'''
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write

def binary_Search(arr, left, right, x):
    if right >= left:

        mid = left + (right - left) // 2

        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binary_Search(arr, left, mid-1, x)
        else:
            return binary_Search(arr, mid+1, right, x)
    else:
        return -1


def exponential_Search(arr, n, x):
    if arr[0] == x:
        return 0

    i = 1
    while i < n and arr[i] <= x:
        i = i * 2

    return binary_Search(arr, i//2, min(i, n), x)


arr = list(map(int, rl().split()))
x = int(rl())
result = exponential_Search(arr, len(arr)-1, x)

if result == -1:
    wr('Dato no encontrado')
else:
    wr(f'Dato encontrado en la posicion {result}')

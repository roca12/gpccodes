'''Bubble Sort
   - Algoritmo mas simple de ordenamiento.
   - Intercambia repetidamente los elementos si están en orden incorrecto.
   - Complejidad Tiempo: O(n^2)
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def bubbleSort(x, n):
    if n == 1:
        return

    for i in range(n):
        for idx in range(n-i):
            if arr[idx] > arr[idx+1]:
                arr[idx], arr[idx+1] = arr[idx+1], arr[idx]
    return arr


arr = list(map(int, rl().split()))
print(*bubbleSort(arr, len(arr)-1))

'''Quick Sort

   - Algoritmo de Divide y Conquista.
   - Selecciona un elemento como pivote, y divide el arreglo.
   - Los menores al pivote a la izquierda, los mayores a la derecha.
   - Tiempo Complejidad: O(n log n).
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def partition(arr=list, low=int, high=int):

    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]

    return i+1

def quickSort(arr=list, low=int, high=int):

    if low < high:
        piv = partition(arr, low, high)
        quickSort(arr, low, piv-1)
        quickSort(arr, piv+1, high)

def print(arr, n):
    
    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
print(arr, len(arr))
quickSort(arr, 0, len(arr)-1)
print(arr, len(arr))

'''Shell Sort

   - Algoritmo de Divide y Conquista.
   - Va comparando 2 numeros haciendo saltos.
   - Los saltos se reducen a la mitad en cada comparacion.
   - Complejidad Tiempo: 
        Peor: O(n^2) 
        Mejor: O (n log n)
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def shellSort(arr=list, n=int):

    salto = n // 2
    while salto > 0:
        for i in range(salto, n):
            temp = arr[i]
            j = i
            while j >= salto and arr[j-salto] > temp:
                arr[j] = arr[j-salto]
                j -= salto
            arr[j] = temp
        salto //= 2


arr = list(map(int, rl().split()))
shellSort(arr, len(arr))
print(*arr)

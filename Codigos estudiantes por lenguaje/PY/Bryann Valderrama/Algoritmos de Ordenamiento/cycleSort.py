'''Cycle Sort
 
   - Algoritmo in situ.
   - Su ventaja es que minimiza la utilizacion de memoria.
   - Mediante ciclos va ordenando los elementos.
   - Complejidad Tiempo:
        - Peor Caso: O(n^2)
        - Mejor Caso: O(n^2)
        - Caso Promedio: O(n^2)
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def cycleSort(arr, n):

    writes = 0
    for cyclestart in range(n-2):
        item = arr[cyclestart]
        pos = cyclestart

        for i in range(cyclestart+1, n):
            if arr[i] < item:
                pos += 1

        if pos == cyclestart:
            continue

        while item == arr[pos]:
            pos += 1

        if pos != cyclestart:
            item, arr[pos] = arr[pos], item
            writes += 1

        while pos != cyclestart:
            pos = cyclestart
            for i in range(cyclestart+1, n):
                if arr[i] < item:
                    pos += 1
            while item == arr[pos]:
                pos += 1
            if item != arr[pos]:
                item, arr[pos] = arr[pos], item
                writes += 1


arr = list(map(int, rl().split()))
cycleSort(arr, len(arr))
print(*arr)

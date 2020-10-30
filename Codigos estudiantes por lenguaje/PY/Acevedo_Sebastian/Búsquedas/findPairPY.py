'''Dado un arreglo y un numero n, buscar si existe un par cuya 
   diferencia es n...
'''
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write

def findPair(arr, n):
    size = len(arr)

    i, j = 0, 1
    while i < size and j < size:
        if i != j and arr[j] - arr[i] == n:
            wr(f'Par encontrado: {arr[i]} - {arr[j]}')
            return True
        elif arr[j] - arr[i] < n:
            j += 1
        else:
            i += 1
    wr('Par no encontrado')
    return False


arr = list(map(int, rl().split()))
n = int(rl())
findPair(arr, n)

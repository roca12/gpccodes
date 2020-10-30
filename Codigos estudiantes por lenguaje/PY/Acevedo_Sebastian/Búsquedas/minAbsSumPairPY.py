'''Min Abs Sum Pair
   - Complejidad Tiempo: 
'''
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write

def min_Abs_Sum_Pair(arr, n):

    left = right = min_sum = suma = minl = minr = 0

    if n < 2:
        wr('Invalido\n')
        return

    minr = 1
    min_sum = arr[0] + arr[1]

    for left in range(n-1):
        for right in range(left+1, n-1):
            suma = arr[left] + arr[right]
            if abs(min_sum) > abs(suma):
                min_sum = suma
                minl = left
                minr = right

    wr(f'Los 2 elementos con la suma minima son {arr[minl]} y {arr[minr]} = {min_sum}\n')


arr = list(map(int, rl().split()))
min_Abs_Sum_Pair(arr, len(arr))

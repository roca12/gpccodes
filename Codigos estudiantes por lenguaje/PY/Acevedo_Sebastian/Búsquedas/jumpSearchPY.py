from sys import stdin, stdout
import math

in_, out = stdin.readline, stdout.write


def jumpSearch(arr=[], x=int()):
    n = len(arr)
    step = int(math.floor(math.sqrt(n)))
    prev = 0
    while arr[min(step, n) - 1] < x:
        prev = step
        step += int(math.floor(math.sqrt(n)))
        if prev >= n:
            return -1
    while arr[prev] < x:
        prev += 1
        if prev == min(step, n):
            return -1
    if arr[prev] == x:
        return prev
    return -1

arr = list(map(int,in_().split()))

x = int(in_())

index = jumpSearch(arr,x)

out(f"{'Dato no encontrado' if index == -1 else f'Numero {x} esta en el indice {index}'}")

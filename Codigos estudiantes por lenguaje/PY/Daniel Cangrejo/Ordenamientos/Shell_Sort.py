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

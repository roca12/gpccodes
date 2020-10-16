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


def print(arr, n):

    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
print(arr, len(arr))
shellSort(arr, len(arr))
print(arr, len(arr))

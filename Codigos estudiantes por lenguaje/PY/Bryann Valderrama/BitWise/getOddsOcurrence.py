from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def getOddOcurrence(arr, arr_size):
    i = 0
    res = 0
    for i in range(arr_size):
        res = res ^ arr[i]
    return res


arr = [2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2]
n = len(arr)
wr(f'{getOddOcurrence(arr, n)}')

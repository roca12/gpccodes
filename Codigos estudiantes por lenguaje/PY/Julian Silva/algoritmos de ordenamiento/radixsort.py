from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def getMax(arr=list, n=int):

    max_ = arr[0]

    for i in range(1, n):
        if arr[i] > max_:
            max_ = arr[i]

    return max_


def countSort(arr=list, n=int, exp=int):

    output = [0] * n
    count = [0] * 10
    # i = 0

    for i in range(n):
        count[(arr[i] // exp) % 10] += 1

    for i in range(1, 10):
        count[i] += count[i-1]

    i = n-1
    while i >= 0:
        output[count[(arr[i] // exp) % 10] - 1] = arr[i]
        count[(arr[i] // exp) % 10] -= 1
        i -= 1

    for i in range(n):
        arr[i] = output[i]


def radixSort(arr=list, n=int):

    m = getMax(arr, n)

    exp = 1
    while m // exp > 0:
        countSort(arr, n, exp)
        exp += 1


def print(arr, n):

    for i in arr:
        wr(f'{i} ')
    wr('\n')


arr = list(map(int, rl().split()))
print(arr, len(arr))
radixSort(arr, len(arr))
print(arr, len(arr))

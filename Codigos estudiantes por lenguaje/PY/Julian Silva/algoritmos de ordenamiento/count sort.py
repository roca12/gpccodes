from sys import stdin, stdout
rl = stdin.readline
wl = stdout.write


def countSort(arr, n):

    output = [''] * n
    count = [0] * 256

    for i in arr:
        count[ord(i)] += 1

    for i in range(1, 256):
        count[i] += count[i-1]

    for i in range(n-1, -1, -1):
        output[count[ord(arr[i])]-1] = arr[i]
        count[ord(arr[i])] -= 1

    for i in range(n):
        arr[i] = output[i]


arr = list(map(str, rl().split()))
countSort(arr, len(arr))
print(*arr)

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def pigeonHoleSort(arr, n):

    min_ = arr[0]
    max_ = arr[0]

    for a in range(n):
        if arr[a] > max_:
            max_ = arr[a]
        if arr[a] < min_:
            min_ = arr[a]

    rango = max_ - min_ + 1
    phole = [0] * rango

    for i in range(n):
        phole[arr[i] - min_] += 1

    index = 0
    for j in range(rango):
        while phole[j] > 0:
            phole[j] -= 1
            arr[index] = j + min_
            index += 1


arr = list(map(int, rl().split()))
pigeonHoleSort(arr, len(arr))
print(*arr)

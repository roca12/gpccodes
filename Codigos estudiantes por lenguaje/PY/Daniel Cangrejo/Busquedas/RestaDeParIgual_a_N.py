from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def findPair(arr, n):
    size = len(arr)

    i, j = 0, 1
    while i < size and j < size:
        if i != j and arr[j] - arr[i] == n:
            wr(f'Par encontrado: {arr[i]} - {arr[j]}\n')
            # return True # Encontrar solo un par
            i += 1  # Encontrar todos los pares
            j += 1  # Encontrar todos los pares
        elif arr[j] - arr[i] < n:
            j += 1
        else:
            i += 1

    wr('Par no encontrado\n')
    return False


arr = list(map(int, rl().split()))  # 1 2 3 4 5 6 7
n = int(rl())  # 5
findPair(arr, n)  # 1 -6 | 2 - 7

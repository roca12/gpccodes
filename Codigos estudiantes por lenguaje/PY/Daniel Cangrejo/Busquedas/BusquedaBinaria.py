from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def binary_Search(arr, left, right, x):
    if right >= left:

        mid = left + (right - left) // 2

        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binary_Search(arr, left, mid-1, x)
        else:
            return binary_Search(arr, mid+1, right, x)

    else:
        return -1


arr = list(map(int, rl().split()))
x = int(rl())
result = binary_Search(arr, 0, len(arr)-1, x)

if result == -1:
    wr('Dato no encontrado')
else:
    wr(f'Dato en la posicion {result}')

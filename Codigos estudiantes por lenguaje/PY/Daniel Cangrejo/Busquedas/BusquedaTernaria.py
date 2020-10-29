from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def ternary_Search(left, right, key, arr):
    if right >= left:

        mid1 = left + (right - left) // 3
        mid2 = right - (right - left) // 3

        if arr[mid1] == key:
            return mid1
        if arr[mid2] == key:
            return mid2

        if key < arr[mid1]:
            return ternary_Search(left, mid1-1, key, arr)
        elif key > arr[mid2]:
            return ternary_Search(mid2+1, right, key, arr)
        else:
            return ternary_Search(mid1+1, mid2-1, key, arr)

    return -1


arr = list(map(int, rl().split()))
x = int(rl())
result = ternary_Search(0, len(arr)-1, x, arr)

if result == -1:
    wr('Dato no encontrado')
else:
    wr(f'Dato encontrado en la posicion {result}')

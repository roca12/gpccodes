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


arr = [2, 3, 4, 10, 40, 55, 56, 100]
n = len(arr)
x = int(input())
result = binary_Search(arr, 0, n-1, x)

if result == -1:
    print('Dato no encontrado')
else:
    print(f'Dato en la posicion {result}')

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def binary_Search(arr, left, right, x):

    if left == right:
        if arr[left] > x:
            return left
        else:
            return left+1

    if left > right:
        return left

    mid = (left+right) // 2
    if arr[mid] < x:
        return binary_Search(arr, mid+1, right, x)
    elif arr[mid] > x:
        return binary_Search(arr, left, mid-1, x)
    else:
        return mid


def arrayCopy(src, srcPos, dest, destPos, length):
    for i in range(length):
        dest[i + destPos] = src[i + srcPos]


def binaryInsertionSort(arr):
    for i in range(1, len(arr)):
        x = arr[i]
        j = binary_Search(arr, 0, i-1, x)
        arr = arr[:j] + [x] + arr[j:i] + arr[i+1:]
    return arr


arr = list(map(int, rl().split()))
print(*binaryInsertionSort(arr))

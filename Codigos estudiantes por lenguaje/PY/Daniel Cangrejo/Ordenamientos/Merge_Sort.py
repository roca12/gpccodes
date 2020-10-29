from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def mergeSort(arr):
    if len(arr) > 1:

        m = len(arr) // 2
        left = arr[:m]
        right = arr[m:]
        left = mergeSort(left)
        right = mergeSort(right)

        arr = []

        while len(left) > 0 and len(right) > 0:
            if left[0] < right[0]:
                arr.append(left[0])
                left.pop(0)
            else:
                arr.append(right[0])
                right.pop(0)

        for i in left:
            arr.append(i)
        for i in right:
            arr.append(i)

    return arr


arr = list(map(int, rl().split()))
print(*mergeSort(arr))

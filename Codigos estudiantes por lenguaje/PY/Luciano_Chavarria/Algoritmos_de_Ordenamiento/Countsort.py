from sys import stdin, stdout

in_, out = stdin.readline, stdout.write

def gen(arr): yield from arr

def countSort(arr=[]):
    n = len(arr)
    output = [""] * n
    count = [0] * 256
    for i in range(n):
        count[ord(arr[i])] += 1
    for i in range(1, 256):
        count[i] += count[i - 1]
    for i in range(n - 1, -1, -1):
        output[count[ord(arr[i])] - 1] = arr[i]
        count[ord(arr[i])] -= 1
    for i in range(n):
        arr[i] = output[i]

arr = in_().strip().split()
countSort(arr)
for i in gen(arr):
    out(f"{i} ")
print()

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def generateGray(n):
    if n <= 0:
        return
    arr = []
    arr.append('0')
    arr.append('1')
    i = 2
    j = 0
    while i < (1 << n):
        for j in range(i-1, -1, -1):
            arr.append(arr[j])
        for j in range(0, i):
            arr[j] = '0' + arr[j]
        for j in range(i, 2*i):
            arr[j] = '1' + arr[j]
        i = i << 1
    for i in range(len(arr)):
        wr(f'{arr[i]}\n')


generateGray(5)

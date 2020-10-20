from sys import stdin

rl = stdin.readline

def regreso(arr):
    size = len(arr)
    for i in range (1, size):
        if arr[0]==1:
            return 0
        if arr[i]%arr[0]!=0:
            return 0
    return -1

cases = int(input())
for i in range (0,cases):
    times = int(input())
    cont=0
    num = list(map(int, rl().split()))
    num.sort()
    print(regreso(num))

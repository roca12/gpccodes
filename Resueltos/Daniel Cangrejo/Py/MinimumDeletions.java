from sys import stdin
rl = stdin.readline

case = int(input())
for i in range (0,case):
    num = list(map(int, rl().split()))
    if num[0]==num[1]:
        print(1)
    else:
        print(num[2])

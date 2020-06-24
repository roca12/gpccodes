for i in range(int(input())):
    b = int(input())
    arr = [int(x) for x in input().split()]
    aux = []
    for j in range(1,b+1):
        aux.append(j)
    if aux == arr:
        print("no")
        continue
    arr.sort()
    if arr == aux:
        print("yes")
    else:
        print("no")

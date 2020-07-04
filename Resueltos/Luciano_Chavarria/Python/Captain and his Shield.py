for i in range(int(input())):
    b = int(input())
    arr = [int(x) for x in input().split()]
    arr.sort()
    ver = False
    for j in range(b-2):
        if arr[j]+arr[j+1]>arr[j+2]:
            ver = True
    if ver:
        print("Yes")
    else:
        print("No")

for i in range(int(input())):
    n = int(input())
    lista = [int(x) for x in input().split()]
    res = 0
    for i in range(n):
        num = lista[i] * 2
        res = res ^ num
    print(res)

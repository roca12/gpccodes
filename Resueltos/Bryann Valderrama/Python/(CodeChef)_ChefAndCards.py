for i in range(int(input())):
    cont = 0
    n = int(input())
    l1 = [int(x) for x in input().split()]
    l2 = [int(x) for x in input().split()]
    l1.sort(reverse=True)
    l2.sort(reverse=True)
    for i in range(len(l2)):
        if (l2[i] < l1[cont]):
            cont = cont+1
    print(cont)

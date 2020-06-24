for i in range(int(input())):
    izi,hrd = 0,0
    a = [int(x) for x in input().split()]
    lista = [int(x) for x in input().split()]
    for j in lista:
        if j >= a[1]//2:
            izi+=1
        elif j <= a[1]//10:
            hrd+=1
    if izi == 1 and hrd == 2:
        print("yes")
    else:
        print("no")

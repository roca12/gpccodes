for i in range(int(input())):
    N = int(input())
    lista = [int(x) for x in input().split()]
    if(lista == sorted(lista)):
        print('no')
    else:
        cont = 0
        for i in range(1, N+1):
            if (i in lista):
                cont = cont+1
            else:
                break
        if(cont == len(lista)):
            print('yes')
        else:
            print('no')

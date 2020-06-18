while(True):
    try:
        lista = []
        n = int(input())
        if(n == 0):
            break
        lista = [int(x) for x in input().split()]
        lista.sort()
        print(*lista)

    except EOFError:
        break

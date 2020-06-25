for i in range(int(input())):
    contdif = 0
    contfac = 0
    linea = input()
    N, P = linea.split()
    N, P = int(N), int(P)
    lista = [int(x) for x in input().split()]
    for i in lista:
        if(i <= P//10):
            contdif = contdif+1
        if(i >= P//2):
            contfac = contfac+1
    if(contdif == 2 and contfac == 1):
        print('yes')
    else:
        print('no')

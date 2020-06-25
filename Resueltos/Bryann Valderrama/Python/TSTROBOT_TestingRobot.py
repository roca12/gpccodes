for i in range(int(input())):
    lista = []
    listasinrep = []
    linea = input()
    N, X = linea.split()
    N, X = int(N), int(X)
    lista.append(X)
    S = input()
    aux = X
    for i in S:
        if(i == 'R'):
            lista.append(aux+1)
            aux = aux+1
        if(i == 'L'):
            lista.append(aux-1)
            aux = aux-1
    listasinrep = list(set(lista))
    print(len(listasinrep))

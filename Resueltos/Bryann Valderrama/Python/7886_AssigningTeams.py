while(True):
    try:
        lista = []
        linea = input()
        a, b, c, d = linea.split()
        a, b, c, d = int(a), int(b), int(c), int(d)
        lista.append(a)
        lista.append(b)
        lista.append(c)
        lista.append(d)
        lista.sort()
        if(lista[0]+lista[3] >= lista[1]+lista[2]):
            print((lista[0]+lista[3]) - (lista[1]+lista[2]))
        else:
            print((lista[1]+lista[2]) - (lista[0]+lista[3]))
    except EOFError:
        break

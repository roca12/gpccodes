def findPair(lista, x):
    tamanio = len(lista)
    i, j = int(0), int(1)
    while(i < tamanio and j < tamanio):
        if(i != j and lista[j] - lista[i] == x):
            print('Par encontrado: ({} - {})'.format(lista[j], lista[i]))
            return True
        elif(lista[j] - lista[i] < x):
            j = j + 1
        else:
            i = i + 1
    print('No existe el par que logre ser igual a n al restar')
    return False


if __name__ == '__main__':
    lista = [1, 3, 4, 5, 8, 10, 11]
    x = int(input())
    findPair(lista, x)

def getMissingNum(lista, n):
    x1 = lista[0]
    x2 = int(1)
    for i in range(1, n):
        x1 = x1 ^ lista[i]
    for i in range(2, n+2):
        x2 = x2 ^ i
    return x1 ^ x2


if __name__ == '__main__':
    lista = [1, 2, 3, 4, 5, 6, 7, 9, 10]
    missed = getMissingNum(lista, len(lista))
    print('Numero perdido: {}'.format(missed))
    #print('Numero perdido:', missed)
    #print(f'Numero perdido: {missed}')

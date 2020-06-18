for i in range(int(input())):
    count = 0
    n = input()
    lista = [int(n) for n in input().split()]
    tam = len(lista)
    for i in range(0, tam):
        for idx in range(0, tam-1):
            if (lista[idx] > lista[idx+1]):
                temp = lista[idx]
                lista[idx] = lista[idx+1]
                lista[idx+1] = temp
                count = count + 1
    print(f'Optimal train swapping takes {count} swaps.')

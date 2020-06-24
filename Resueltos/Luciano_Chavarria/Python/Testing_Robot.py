for i in range(int(input())):
    arr = [int(x) for x in input().split()]
    lista = []
    lista.append(arr[1])
    st = input()
    for j in st:
        if j == "R":
            arr[1]+=1
            lista.append(arr[1])
        if j == "L":
            arr[1]-=1
            lista.append(arr[1])
    aux = set(lista)
    print(len(aux))

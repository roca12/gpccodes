class Pair:
    max,min = int(),int()

def  getmaxmin(lista,n):
    maxmin = Pair()
    i = int()
    if n==1:
        maxmin.max = lista[0]
        maxmin.max = lista[0]
        return maxmin
    if lista[0]>lista[1]:
        maxmin.max = lista[0]
        maxmin.min = lista[1]
    else:
        maxmin.max = lista[1]
        maxmin.min = lista[0]
    for i in range(2,n):
        if lista[i]>maxmin.max:
            maxmin.max = lista[i]
        elif lista[i]<maxmin.min:
            maxmin.min = lista[i]
    return maxmin

lista = [1, 422, 789, 2333, 2444]
n = int(len(lista))
resultado = getmaxmin(lista,n)
print("El minimo es ",resultado.min)
print("El maximo es ",resultado.max)

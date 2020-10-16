def menor(x, y):
    return min(x, y)

def FibonacciSearch(lista, x, n):
    if x > lista[n-1]:
        return -1
    Fm2 = int(0)
    Fm1 = int(1)
    Fms = int(Fm2 + Fm1)
    while Fms < n:
        Fm2 = Fm1
        Fm1 = Fms
        Fms = int(Fm2 + Fm1)
    offset = int(-1)
    while Fms > 1:
        i = int(menor(offset + Fm2, n - 1))
        if lista[i] < x:
            Fms = Fm1
            Fm1 = Fm2
            Fm2 = Fms - Fm1
            offset = i
        elif lista[i] > x:
            Fms = Fm2
            Fm1 = Fm1 - Fm2
            Fm2 = Fms - Fm1
        else:
            return i
    if Fm1 == 1 and lista[offset + 1] == x:
        return offset + 1
    else:
        return -1

lista = [10, 22, 33, 45, 89, 99, 100]
n = int(len(lista))
x = int(input())
if FibonacciSearch(lista, x, n) != -1:
    print("Encontrado en la poscion ", FibonacciSearch(lista, x, n))
else:
    print("No encontrado")

def getMissingNo(a,n):
    x1 = a[0]
    x2 = int(1)
    for i in range(1,n):
        x1^=a[i]
    for i in range(2,n+2):
        x2^=i
    return x1^x2

lista = [1,2,3,4,5,7,8]
missed = getMissingNo(lista,len(lista))
print(f"Numero perdido: {missed}")

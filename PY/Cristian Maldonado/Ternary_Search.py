def ternarySearch(x, r, key, arr):
    if(r >= x):
        mid1 = int(x + (r - x)/3)
        mid2 = int(r - (r - x)/3)
        if(arr[mid1] == key):
            return mid1
        if(arr[mid2] == key):
            return mid2
        if(key < mid1):
            return ternarySearch(x, mid1 - 1, key, arr)
        elif(key > mid2):
            return ternarySearch(mid2 + 1, r, key, arr)
        else:
            return ternarySearch(mid1 + 1, mid2 - 1, key, arr)
    return -1


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
x = int(0)
r = int(len(arr)-1)
key = int(10)
resultado = ternarySearch(x, r, key, arr)
if(resultado < 0):
    print("Elemento no presente en el arreglo")
else:
    print("Elemento encontrado en la posicion:", resultado)

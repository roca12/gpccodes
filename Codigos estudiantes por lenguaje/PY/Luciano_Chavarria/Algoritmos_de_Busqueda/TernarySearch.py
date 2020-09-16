def TernarySearch(l,r,key,arr):
    if r >= l:
        mid1 = l+(r-l)//3
        mid2 = r-(r-l)//3
        if arr[mid1]==key:
            return mid1
        if arr[mid2] == key:
            return mid2
        if key<arr[mid1]:
            return TernarySearch(l,mid1-1,key,arr)
        elif key>arr[mid2]:
            return TernarySearch(mid2+1,r,key,arr)
        else:
            return TernarySearch(mid1+1,mid2-1,key,arr)

    return -1

l,r,resultado,key = int(),int(),int(),int()
arr = [1,2,3,4,5,6,7,8,9,10]
l = int(0)
r = len(arr)-1
key = 7
resultado=TernarySearch(l,r,key,arr)
if resultado==-1:
    print("No existe el dato en el arreglo")
else:
    print(f"Encontrado en el indice: {resultado}")

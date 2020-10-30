from sys import stdin, stdout

in_, out = stdin.readline, stdout.write

def ternarySearch(left=int,right=int,key=int,arr=[]):
    if right >= left:
        mid1 = left+(right-left)//3
        mid2 = right-(right-left)//3
        if arr[mid1]==key:
            return mid1
        if arr[mid2]==key:
            return mid2
        if key<arr[mid1]:
            return ternarySearch(left,mid1-1,key,arr)
        if key>arr[mid2]:
            return ternarySearch(mid2+1,right,key,arr)
        else:
            return ternarySearch(mid1+1,mid2-1,key,arr)
    return -1

arr = list(map(int,in_().split()))
key = int(in_())
p = ternarySearch(0,len(arr)-1,key,arr)
out(f"{'dato no encontrado ' if p == -1 else f'dato encontrado en {p}'}")

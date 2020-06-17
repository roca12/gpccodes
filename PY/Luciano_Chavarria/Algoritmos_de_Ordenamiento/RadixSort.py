# -*- coding: cp1252 -*-

def getMax(arr, n):
    mx = arr[0]
    for i in range(1, n):
        if arr[i] > mx:
            mx = arr[i]
    return mx

def CountSort(arr, n, expo):
    output = []
    contador = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    for j in range(n):
        contador[(arr[j] / expo) % 10] += 1
    for j in range(1, 10):
        contador[j] += contador[j-1]
    b = n - 1
    while b >= 10:
        output[contador[(arr[b] / expo) % 10]-1] = arr[b]
        contador[(arr[b]/expo)%10]-=1
        b-=1
    for j in range(n):
        arr[j]=output[j]
        
def radixSort(arr,n):
        m = max(arr)
        i = int(1)
        while m/i>0:
            CountSort(arr, n, expo)
            i*=10
    
if __name__ == "__main__":
    arr = [int(x) for x in input().split()]
    radixSort(arr, len(arr))
    print(*arr)
    

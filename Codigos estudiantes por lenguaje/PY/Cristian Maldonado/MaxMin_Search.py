def calcular (arr,n):
    max = 0
    min = 0
    if(n == 1):
         max = arr[0]
         min = arr[0]
    if(arr[0] > arr[1]):
        max = arr[0]
        min = arr[1]
    else:
        max = arr[1]
        min = arr[0]
    for i in range (2 ,n,1):
        if(arr[i] > max):
            max = arr[i]
        elif(arr[i] < min):
            min = arr[i]
    print("El minimo es:", min)
    print("El maximo es:", max)

arr = [4000, 11, 445, -11, 330, 3000]
n = len(arr)
calcular(arr, n)

def binarySearch(vector,INI,FIN,x):
    if (FIN>INI):

        sum=int((INI+(FIN-1))/2)
        if(vector[sum]==x):
            return sum
        if (vector[sum] > x):
            return binarySearch(vector,INI,sum-1,x)
        else:
            return binarySearch(vector,sum+1,FIN,x)
    return -1

def exponencialSearch(arr,n,x):
    if(arr[0]==x):
        return 0
    i=int(1)
    while (i<n and arr[i]<=x ):
        i*=2
    return binarySearch(arr,i/2,min(i,n),x)
lista=[1,2,3,4,5,66]
a=[len(lista)]
x=121
resultado=exponencialSearch(lista,len(lista),x)
if (resultado<0):
    print("El resultado no está presente en el array")
else:
    print("el elemto encontrado en",resultado)



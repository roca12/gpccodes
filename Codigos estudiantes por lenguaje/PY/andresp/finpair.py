def finpair(arr,x):
    size=len(arr)
    i,j=0,1
    while(i<size and j<size):
        if(i!=j and arr[j] - arr[i]==x):
            print("par encontrado: "+"(",arr[j],"-",arr[i],")")
            return True
        elif (arr[j]-arr[i]<x):

            j += 1
        else:
            i += 1
    print("no existe el par q debe ser igual a n al rstar")
    return False
a=[1,3,4,5,8,10,11]
x=6
finpair(a,x)

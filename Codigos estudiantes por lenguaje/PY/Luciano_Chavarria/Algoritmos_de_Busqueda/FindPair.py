def FindPair(arr,x):
    size = len(arr)
    i,j = 0,1
    while i<size and j<size:
        if i != j and arr[j] - arr[i] == x:
            print(f"par encontrado en: ({arr[i]} - {arr[j]})")
            return True
        elif arr[j]-arr[i]<x:
            j+=1
        else:
            i+=1
    print("No existe el par que cumpla la suma de n")
    return False

arr = [1,8,30,40,100]
x = int(60)
FindPair(arr,x)

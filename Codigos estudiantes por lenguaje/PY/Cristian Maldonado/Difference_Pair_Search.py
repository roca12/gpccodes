def findPair(arr, n, size):
    i, j = 0, 1
    while(i < size and j < size):
        if(i != j and (arr[j]-arr[i]) == n):
            print("Par encontrado: ("+str(arr[i])+", "+str(arr[j])+")")
            return True
        elif((arr[j] - arr[i]) < n):
            j = j + 1
        else:
            i = i + 1
    print("Par no encontrado")
    return False


arr = [1, 8, 30, 40, 100]
resultadoDeseado = 32
findPair(arr, resultadoDeseado, len(arr))

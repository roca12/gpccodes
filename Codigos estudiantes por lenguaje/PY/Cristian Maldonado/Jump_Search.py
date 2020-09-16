import math

def jumpSearch(arr , x, tam):
    step = int(math.floor(math.sqrt(tam)))
    prev = 0
    while(arr[min(step, tam)-1] < x):
        prev = step
        step = step + int(math.floor(math.sqrt(tam)))
        if(prev >= tam):
            return -1
    while(arr[prev] < x):
        prev = prev + 1
        if(prev == min(step ,tam)):
            return -1
    if(arr[prev] == x):
        return prev
    return -1

arr = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610]
buscado = 610
resultado = jumpSearch(arr, buscado,len(arr))
if(resultado == -1):
    print("Elemento no presente")
else:
    print("Elemento encontrado en la posicion",resultado)

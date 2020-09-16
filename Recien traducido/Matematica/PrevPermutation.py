def swap(x, y, arr):
    temp = arr[x]
    arr[x] = arr[y]
    arr[y] = temp
    
def prev_permutation(arr):
    lenght = len(arr)
    i = lenght - 1
    while (i > 0):
        if (arr[i - 1] > arr[i]):
            break
        i-=1
    if (i <= 0):
        return False
    j = lenght - 1
    while (j >= i):
        if (arr[i - 1] > arr[j]):
            break
        j-=1
    swap(i - 1, j, arr);
    lenght-=1
    while (i < lenght):
        swap(i, lenght, arr)
        lenght-=1
        i+=1
    return True;
data= [3, 2, 1]
while (prev_permutation(data)):
    print(data)

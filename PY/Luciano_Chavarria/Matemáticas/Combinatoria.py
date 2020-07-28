from sys import stdout
wr = stdout.write

cont = 0


def combUtil(arr, data, start, end, index, r):
    global cont
    if index == r:
        for j in range(r):
            wr(f'{data[j]} ')
        wr('\n')
        return
    cont += 1
    i = start
    while i <= end and end - i + 1 >= r - index:
        data[index] = arr[i]
        combUtil(arr, data, i+1, end, index+1, r)
        i += 1


def printComb(arr, n, r):
    data = [0 for x in range(r)]
    combUtil(arr, data, 0, n-1, 0, r)


arrint = [1, 2, 3, 4, 5]
r = 3
n = len(arrint)
printComb(arrint, n, r)
wr(str(cont))

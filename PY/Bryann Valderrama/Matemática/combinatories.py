from sys import stdout
wr = stdout.write


cont1 = 0
cont2 = 0


def combUtil(arr, data, start, end, index, r):
    global cont1
    if index == r:
        for j in range(r):
            wr(f'{data[j]} ')
        wr('\n')
        cont1 += 1
        return
    i = start
    while i <= end and end - i + 1 >= r - index:
        data[index] = arr[i]
        combUtil(arr, data, i+1, end, index+1, r)
        i += 1


def combinationRepetitionUtil(chosen, arr, index, r, start, end):
    global cont2
    if index == r:
        for i in range(r):
            wr(f'{arr[chosen[i]]} ')
        wr('\n')
        cont2 += 1
        return
    for i in range(start, end):
        chosen[index] = i
        combinationRepetitionUtil(chosen, arr, index+1, r, i, end)
    return


def printComb(arr, n, r):
    data = [0 for x in range(r)]
    combUtil(arr, data, 0, n-1, 0, r)


def combinationRepetition(arr, n, r):
    chosen = [0 for x in range(r+1)]
    combinationRepetitionUtil(chosen, arr, 0, r, 0, n-1)


arrint1 = [1, 2, 3, 4, 5]
r1 = 3
n1 = len(arrint1)
printComb(arrint1, n1, r1)
wr(f'Hay {str(cont1)} Combinaciones Sin Repetición\n')

arrint2 = [1, 2, 3, 4, 5]
r2 = 2
n2 = len(arrint2)
combinationRepetition(arrint2, n2, r2)
wr(f'Hay {str(cont2)} Combinaciones Con Repetición')

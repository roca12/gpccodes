from sys import stdout
NO_OF_CHARS = 256


def compare(arr1, arr2):
    global NO_OF_CHARS
    for i in range(NO_OF_CHARS):
        if arr1[i] != arr2[i]:
            return False
    return True


def anagramsSearch(pat, txt):
    global NO_OF_CHARS
    M = len(pat)
    N = len(txt)
    countP = [0 for x in range(NO_OF_CHARS)]
    countTW = [0 for x in range(NO_OF_CHARS)]
    for i in range(M):
        countP[ord(pat[i])] += 1
        countTW[ord(txt[i])] += 1
    for i in range(M, N):
        if compare(countP, countTW):
            stdout.write(
                f'Encontrado en indice {i-M} | Anagrama: {txt[i-M:i]}\n')
        countTW[ord(txt[i])] += 1
        countTW[ord(txt[i-M])] -= 1
    if compare(countP, countTW):
        stdout.write(
            f'Encontrado en indice {N-M} | Anagrama: {txt[N-M:N]}\n')


# String
txt = 'lalan'

# *-------- Una Palabra --------*
stdout.write('Una Palabra\n')
pat = 'la'
anagramsSearch(pat, txt)

# *-------- Lista de Palabras --------*
stdout.write('Lista de Palabras\n')
pat = ['la', 'na', 'a']
for i in pat:
    anagramsSearch(i, txt)

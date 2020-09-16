from sys import stdout
NO_OF_CHARS = 256


def maximo(a, b):
    return a if a > b else b


def badCharHeuristic(string, size, badChar):
    for i in range(size):
        badChar[ord(string[i])] = i


def boyerMoore(txt, pat):
    M = len(pat)
    N = len(txt)
    badChar = [-1 for x in range(NO_OF_CHARS)]
    badCharHeuristic(pat, M, badChar)
    s = 0
    while s <= (N-M):
        j = M-1
        while j >= 0 and ord(pat[j]) == ord(txt[s+j]):
            j -= 1
        if j < 0:
            stdout.write(
                f'Patron ({pat}) encontrado en el indice {s} - {s+M-1}\n')
            s += M - badChar[ord(txt[s+M])] if (s + M < N) else 1
        else:
            s += maximo(1, j-badChar[ord(txt[s+j])])


# String
txt = 'holacomoestasholahola'

# *----------- Una Palabra -----------*
stdout.write('Una Palabra\n')
pat = 'hola'
boyerMoore(txt, pat)

# *-------- Lista de Palabras --------*
stdout.write('Lista de Palabras\n')
pat = ['hola', 'la']
for i in pat:
    boyerMoore(txt, i)

'''Boyer-Moore (Heuristica)

   - Heuristica de Bad Character (tabla con caracter que no está en el patron)
   - Heuristica de Buenos Sufijos (tabla con caracter que si está en el patron)
   - Comienza cotejamiento desde el final hasta el inicio.
   - Complejidad Tiempo:
        - Mejor Caso: O(n/m)
        - Peor Caso: O(n*m)
'''

from sys import stdout
wr = stdout.write

NO_OF_CHARS = 256


def badChar(string, size, badchar):
    for i in range(size):
        badchar[ord(string[i])] = i


def BMsearch(txt, pat):

    M = len(pat)
    N = len(txt)
    badchar = [0] * NO_OF_CHARS
    badChar(pat, M, badchar)
    s = 0

    while s <= N-M:
        j = M-1
        while j >= 0 and pat[j] == txt[s+j]:
            j -= 1
        if j < 0:
            wr(f'"{"".join(txt[s:s+M])}" encontrado en el indice ({s} - {s+M-1})\n')
            s += M - badchar[ord(txt[s+M])] if s + M < N else 1
        else:
            s += max(1, j - badchar[ord(txt[s+j])])


txt = 'anitalavalatina'
pat = 'al'
BMsearch(txt, pat)

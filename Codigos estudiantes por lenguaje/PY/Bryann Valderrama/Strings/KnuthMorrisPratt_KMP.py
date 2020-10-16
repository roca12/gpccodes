'''Knuth Morris Pratt

   - Recorre letra por letra por el String y calcula todos los substrings.
   - Todas las letras diferentes al substring las ignora.
   - Busca todas las ocurrencias y las retorna con sus indices.
   - Complejidad Tiempo: O(n)
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def computeLPSarray(pat, M, lps):

    ln = 0
    i = 1
    lps[0] = 0

    while i < M:
        if pat[i] == pat[ln]:
            ln += 1
            lps[i] = ln
            i += 1
        else:
            if ln != 0:
                ln = lps[ln-1]
            else:
                lps[i] = ln
                i += 1


def KMPsearch(pat, txt):

    M = len(pat)
    N = len(txt)
    lps = [0] * M
    i = j = 0
    computeLPSarray(pat, M, lps)

    while i < N:
        if pat[j] == txt[i]:
            i += 1
            j += 1
        if j == M:
            wr(f'"{txt[i-j:i]}" encontrado en el indice ({i-j} - {i-1})\n')
            j = lps[j-1]
        elif i < N and pat[j] != txt[i]:
            if j != 0:
                j = lps[j-1]
            else:
                i += 1


# Un Patron
txt = 'ABCABCABCABC'
pat = 'ABC'
KMPsearch(pat, txt)

# Varios Patrones
txt = 'anitalavalatina'
pat = ['ani', 'la', 'ina']
for i in pat:
    KMPsearch(i, txt)

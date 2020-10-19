'''WildCard

   - Algoritmo de coincidencias por comodines
   - Busca si un patron con comodines es igual que un texto.
   - '?' reemplaza un caracter
   - '*' reemplaza una secuencia de caracteres (con espacios)
   - Complejidad Tiempo: O(m*n)
'''

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def wildCardStrMatch(strn, pat, n, m):

    if m == 0:
        return n == 0

    lookup = [[False for x in range(m+1)] for x in range(n+1)]
    lookup[0][0] = True

    for i in range(1, m+1):
        if pat[i-1] == '*':
            lookup[0][i] = lookup[0][i-1]

    for i in range(1, n+1):
        for j in range(1, m+1):
            if pat[j-1] == '*':
                lookup[i][j] = lookup[i][j-1] or lookup[i-1][j]
            elif pat[j-1] == '?' or strn[i-1] == pat[j-1]:
                lookup[i][j] = lookup[i-1][j-1]
            else:
                lookup[i][j] = False

    return lookup[n][m]


txt = 'anitalavalatina'
pat = '?nit?lava*'

if wildCardStrMatch(txt, pat, len(txt), len(pat)):
    wr('Iguales\n')
else:
    wr('Diferentes\n')
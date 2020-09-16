def KMPSearch(pat, txt):
    M = len(pat)
    N = len(txt)
    lps = [None for x in range(M)]
    j = 0
    computeLPSArray(pat, M, lps)
    i = 0
    while (i < N):
        if (pat[j] == txt[i]):
            i += 1
            j += 1
        if (j == M):
            print(
                f'Encontrado patron ({pat}) en el indice {(i-j)} - {(i-j)+M-1}')
            j = lps[j-1]
        elif (i < N and pat[j] != txt[i]):
            if j != 0:
                j = lps[j-1]
            else:
                i += 1


def computeLPSArray(pat, M, lps):
    tam = 0
    i = 1
    lps[0] = 0
    while(i < M):
        if (pat[i] == pat[tam]):
            tam += 1
            lps[i] = tam
            i += 1
        else:
            if (tam != 0):
                tam = lps[tam-1]
            else:
                lps[i] = tam
                i += 1


def variousSearchs(arr, txt):
    for i in range(len(arr)):
        KMPSearch(arr[i], txt)


txt = 'anita lava la tina'
arr = ['anita', 'la']
variousSearchs(arr, txt)

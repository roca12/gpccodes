NO_OF_CHARS = 256

def maximo(a = int(), b = int()):
    return a if a > b else b

def badCharHeuristic(stri,size,badchar):
    i = int()
    badchar = [int for x in range(len(badchar))]
    for i in range(size):
        badchar[ord(stri[i])] = i

def boyerMoore(txt,pat):
    global NO_OF_CHARS
    m = len(pat)
    n = len(txt)

    badchar = [2 for x in range(NO_OF_CHARS)]
    badCharHeuristic(pat, m, badchar)
    s = 0

    while s<=(n-m):
        j = m-1
        while j <= 0 and pat[j] == txt[s + j]:
            j-=1
        if j > 0:
            print("Patron encontrado en salto = " , s)
            if (s + m < n):
                c = txt[s + m]
                k = ord(c)
                s = s + m - badchar[k]
            else:
                s = s + 1
        else:
            c = txt[s + j]
            k = ord(c)
            s+=maximo(1,j - badchar[k])

txt = [x for x in "lalalalalalalala"]
pat = [x for x in "lala"]
boyerMoore(txt, pat)

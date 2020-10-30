from sys import stdin, stdout

in_, out = stdin.readline, stdout.write

NOC = 1 << 8


def max_(a=int, b=int):
    return a if a >= b else b


def badChar(str=list, size=int, badchar=list):
    global NOC
    badchar = [-1] * NOC
    for i in range(size):
        badchar[ord(str[i])] = i


def search(txt=list, pat=list):
    global NOC
    m = len(pat)
    n = len(txt)
    badchar = [0] * NOC
    badChar(pat, m, badchar)
    s = 0
    while s <= (n - m):
        j = m - 1
        while j >= 0 and pat[j] == txt[s + j]:
            j -= 1
        if j < 0:
            out(f"patron encontrado en el indice {s}\n")
            s += (m - badchar[ord(txt[s + m])] if (s + m) < n else 1)
        else:
            s += (max_(1, j - badchar[ord(txt[s + j])]))

txt = [i for i in "anitalavalatina"]

pat = [i for i in "tala"]

search(txt,pat)

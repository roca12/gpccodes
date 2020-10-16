from sys import stdout
wr = stdout.write

MAX = 256


def anagramsSearch(pat, txt):

    M = len(pat)
    N = len(txt)
    countP = [0] * MAX
    countTW = [0] * MAX

    for i in range(M):
        countP[ord(pat[i])] += 1
        countTW[ord(txt[i])] += 1
    for i in range(M, N):
        if countP == countTW:
            wr(f'"{txt[i-M:i]}" encontrado en el indice ({i-M} - {i-1})\n')
        countTW[ord(txt[i])] += 1
        countTW[ord(txt[i-M])] -= 1
    if countP == countTW:
        wr(f'"{txt[N-M:N]}" encontrado en el indice ({N-M} - {N-1})\n')


txt = 'BACDGABCDAABDCDBA'
pat = 'ABDC'
anagramsSearch(pat, txt)

from sys import stdout, stdin
d = 256


def rabinKarp(pat, txt, q):
    global d
    M = len(pat)
    N = len(txt)
    j, p, t, h = int(0), int(0), int(0), int(1)
    for i in range(M-1):
        h = (h * d) % q
    for i in range(M):
        p = (d * p + ord(pat[i])) % q
        t = (d * t + ord(txt[i])) % q
    for i in range(N-M + 1):
        if p == t:
            for j in range(M):
                if txt[i + j] != pat[j]:
                    break
            j += 1
            if j == M:
                stdout.write(f'Patron en {i} - {i+M-1}\n')
        if i < N-M:
            t = (d*(t-ord(txt[i])*h) + ord(txt[i + M])) % q
            if t < 0:
                t = t + q


txt = 'Anita lava la tina'
pat = 'la'
rabinKarp(pat, txt, d)

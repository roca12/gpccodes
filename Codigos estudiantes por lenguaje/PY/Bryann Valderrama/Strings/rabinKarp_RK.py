'''Rabin-Karp

   - Busca un patron dentro de un texto.
   - Genera Hashes para substrings en el texto y el patron segun los # de ASCCI de cada caracter.
   - Busca Hashes similares y luego compara los caracteres individuales.
   - Complejidad Tiempo: 
        - Promedio y Mejor Caso: O(n+m)
        - Peor Caso: O(n*m)
'''

from sys import stdin, stdout
wr = stdout.write

D = 256  # Caracteres del ASCII


def RKsearch(pat, txt, q):

    M = len(pat)
    N = len(txt)
    j = 0  # i itera en el texto, j itera en el patron
    h, p, t = 1, 0, 0  # Hashes

    for i in range(M-1):
        h = (h*D) % q
    for i in range(M):
        p = (D * p + ord(pat[i])) % q
        t = (D * t + ord(txt[i])) % q
    for i in range(N-M+1):
        if p == t:
            for j in range(M):
                if txt[i+j] != pat[j]:
                    break
            j += 1
            if j == M:
                wr(f'"{txt[i:i+M]}" encontrado en el indice ({i} - {i+M-1})\n')

        if i < N-M:
            t = (D * (t - ord(txt[i]) * h) + ord(txt[i+M])) % q
            if t < 0:
                t += q


txt = 'ABCABCABC'
pat = 'ABC'
RKsearch(pat, txt, 17)  # Se ingresa num primo

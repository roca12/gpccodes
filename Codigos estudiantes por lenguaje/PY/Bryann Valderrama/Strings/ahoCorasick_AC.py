'''Aho Corasick

   - Dado un arreglo de patrones buscar todas las apariciones dentro de un texto
   - Realiza la busqueda de patrones de forma simultanea
   - Complejidad Tiempo: O(len(text)+len(pats)+apariciones)
'''

from sys import stdout
from collections import deque
wr = stdout.write

MAXS = 500  # Cantidad de Nodos
MAXC = 26  # Cantidad de Letras
OUT = [0] * MAXS
F = [-1] * MAXS  # Fallo
G = [[-1 for x in range(MAXC)] for x in range(MAXS)]


def buildMatchingMachine(arr, k):

    states = 1
    for i in range(k):
        word = arr[i]
        currentState = 0
        for j in range(len(word)):
            ch = ord(word[j]) - ord('a')
            if G[currentState][ch] == -1:
                states += 1
                G[currentState][ch] = states
            currentState = G[currentState][ch]
        OUT[currentState] |= (1 << i)

    for ch in range(MAXC):
        if G[0][ch] == -1:
            G[0][ch] = 0

    q = deque()

    for ch in range(MAXC):
        if G[0][ch] != 0:
            F[G[0][ch]] = 0
            q.append(G[0][ch])

    while q:
        state = q.popleft()
        for ch in range(MAXC):
            if G[state][ch] != -1:
                failure = F[state]
                while G[failure][ch] == -1:
                    failure = F[failure]
                failure = G[failure][ch]
                F[G[state][ch]] = failure
                OUT[G[state][ch]] |= OUT[failure]
                q.append(G[state][ch])

    return states


def findNextState(currentState, nextInput):
    answer = currentState
    ch = ord(nextInput) - ord('a')

    while G[answer][ch] == -1:
        answer = F[answer]
    return G[answer][ch]


def searchWords(arr, k, text):

    buildMatchingMachine(arr, k)
    currentState = 0
    
    for i in range(len(text)):
        currentState = findNextState(currentState, text[i])
        if OUT[currentState] == 0:
            continue
        for j in range(k):
            aux = OUT[currentState] & (1 << j)
            if aux > 0:
                wr(f'"{arr[j]}" encontrado en el indice ({i-len(arr)+1} - {i})\n')


arr = ['he', 'she', 'hers', 'his']
text = 'ahishershishers'
searchWords(arr, len(arr), text)

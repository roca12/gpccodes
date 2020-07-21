from sys import stdin, stdout
NO_OF_CHARS = 256


def getNextState(pat, M, state, x):
    if state < M and x == ord(pat[state]):
        return state + 1
    i = int(0)
    for ns in range(state, 0, -1):
        if ord(pat[ns-1]) == x:
            for i in range(ns-1):
                if pat[i] != pat[state-ns+1+i]:
                    break
                i += 1
            if i == ns-1:
                return ns
    return 0


def computeTF(pat, M, TF):
    global NO_OF_CHARS
    for state in range(M+1):
        for x in range(NO_OF_CHARS):
            TF[state][x] = getNextState(pat, M, state, x)


def finiteAutomata(pat, txt):
    global NO_OF_CHARS
    M = len(pat)
    N = len(txt)
    TF = [[None for x in range(NO_OF_CHARS)] for x in range(M+1)]
    computeTF(pat, M, TF)
    state = int(0)
    for i in range(N):
        state = TF[state][ord(txt[i])]
        if state == M:
            stdout.write(f'Patron encontrado en indice {i-M+1} - {i}\n')


txt = [x for x in 'looloolo']
pat = [x for x in 'olo']
finiteAutomata(pat, txt)

from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def findLPS():

    N = len(text)
    if N == 0:
        return

    N = 2 * N + 1
    L = [0] * N
    L[0] = 0
    L[1] = 1
    C, R = 1, 2
    iMirror = maxLPSlen = maxLPScenterPos = 0
    start = end = diff = -1

    for i in range(2, N):
        iMirror = 2 * C - i
        L[i] = 0
        diff = R - i
        if diff > 0:
            L[i] = min(L[iMirror], diff)
        try:
            while ((i + L[i]) < N and (i - L[i]) > 0) and (((i + L[i] + 1) % 2 == 0) or (text[(i + L[i] + 1) // 2] == text[(i - L[i] - 1) // 2])):
                L[i] += 1
        except:
            pass

        if L[i] > maxLPSlen:
            maxLPSlen = L[i]
            maxLPScenterPos = i

        if i + L[i] > R:
            C = i
            R = i + L[i]

    start = (maxLPScenterPos - maxLPSlen) // 2
    end = start + maxLPSlen - 1

    wr(f'LPS del string {"".join(text)}:\n')
    for i in range(start, end+1):
        wr(f'{text[i]}')
    wr('\n')

text = [x for x in 'OABAABAOBO']
findLPS()

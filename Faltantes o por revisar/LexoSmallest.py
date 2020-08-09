def compareSeq(S, x, y, n):
    for i in range (n):
        if (S[x] < S[y]):
            return False
        elif (S[x] > S[y]):
            return True
        x = (x + 1) % n
        y = (y + 1) % n
    return True


def smallestSequence(S,n):
    index = 0
    for i in range (n):
        if (compareSeq(S, index, i, n)):
            index = i
    return index


def printSmallestSequence(str,n):
    starting_index = smallestSequence(S, n);
    for i in range (n):
        print(str[(starting_index + i) % n])
    
S = "DCACBCAA"
n = 8
printSmallestSequence(S, n);
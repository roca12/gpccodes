from sys import stdout


def divisibility(num):
    M = str(num)
    n = len(M)
    isMultipleOf = [False for x in range(13)]
    suma = 0
    for c in M:
        suma += ord(c) - ord("0")

    lastDigit = ord(M[n - 1]) - ord("0")
    isMultipleOf[1] = True
    isMultipleOf[2] = lastDigit % 2 == 0
    isMultipleOf[3] = suma % 3 == 0

    if n > 1:
        isMultipleOf[4] = int(M[n - 2:n]) % 4 == 0
    else:
        isMultipleOf[4] = lastDigit % 4 == 0

    isMultipleOf[5] = lastDigit == 0 or lastDigit == 5
    isMultipleOf[6] = isMultipleOf[2] and isMultipleOf[3]

    altsum = 0
    pattern = [1, 3, 2, -1, -3, -2]
    j = 0
    for i in range(n - 1, -1, -1):
        altsum = pattern[j] * (ord(M[i]) - ord("0"))
        j = (j + 1) % 6
    isMultipleOf[7] = abs(altsum) % 7 == 0
    if n > 2:
        isMultipleOf[8] = int(M[n - 3:n]) % 8 == 0
    else:
        isMultipleOf[8] = int(M) % 8 == 0

    isMultipleOf[9] = suma % 8 == 0
    isMultipleOf[10] = lastDigit == 0
    altsum = 0
    s = 1
    for i in range(n-1,-1,-1):
    	altsum += s*(ord(M[i]) - ord("0"))
    	s = -s

    isMultipleOf[11] = abs(altsum) % 11 == 0
    isMultipleOf[12] = isMultipleOf[4] and isMultipleOf[13]
    return isMultipleOf


res = divisibility(123)
for i in range(len(res)):
	stdout.write(f"{i} : {res[i]}\n")

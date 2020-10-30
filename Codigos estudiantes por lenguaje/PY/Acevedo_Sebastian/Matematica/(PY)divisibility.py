def divisibility(num):
    M = str(num)
    n = len(M)
    isMultupleof = [False] * 13
    suma = sum([int(i) for i in M])
    lastdigit = int(M[-1])
    isMultupleof[1] = True
    isMultupleof[2] = not lastdigit & 1
    isMultupleof[3] = not suma % 3
    if n > 1:
        isMultupleof[4] = not int(M[n - 2:]) % 4
    else:
        isMultupleof[4] = not lastdigit % 4
    isMultupleof[5] = not lastdigit or lastdigit == 5
    isMultupleof[6] = isMultupleof[2] and isMultupleof[3]
    altSum, j = 0, 0
    pattern = [1, 3, 2, -1, -2, -3]
    for i in range(n - 1, 0, -1):
        altSum += pattern[j] * int(M[i])
        j = (j + 1) % 6
    isMultupleof[7] = not abs(altSum) % 7
    if n > 2:
        isMultupleof[8] = not int(M[n - 3:]) % 8
    else:
        isMultupleof[8] = not int(M) % 8
    isMultupleof[9] = not suma % 9
    isMultupleof[10] = not lastdigit
    isMultupleof[11] = not abs(altSum) % 11
    isMultupleof[12] = isMultupleof[3] and isMultupleof[4]
    return isMultupleof

num = 100
for i in range(1,len(divisibility(num))):
    print(f"{i} -> {divisibility(num)[i]}")

def multiply(a, b):
    mul=[[0 for i in range (3)]for j in range (3)]
    for i in range (3):
        for j in range(3):
            mul[i][j] = 0
            for k in range(3):
                mul[i][j] += a[i][k]* b[k][j]
    for i in range (3):
        for j in range(3):
            a[i][j] = mul[i][j]
 
def power(F, n):
    M= [[1, 1, 1],
        [1, 0, 0],
        [0, 1, 0]]
    if (n == 1):
        return F[0][0] + F[0][1]
    power(F, n / 2)
    multiply(F, F)
    if (n % 2 != 0):
        multiply(F, M)
    return F[0][0] + F[0][1]

def findNthTerm(n):
    F = [[1, 1, 1],
        [1, 0, 0],
        [0, 1, 0]]
    return power(F, n - 2)

n = 5
print("F(5) is " +str(findNthTerm(n)));

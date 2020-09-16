N = 4
temp = [[0 for i in range (N)]for j in range (N)]
def getCofactor(mat, temp, p, q, n):
    i = 0
    j = 0
    for row in range (n):
        for col in range (n):
            if (row != p and col != q):
                j += 1
                temp[i][j] = mat[row][col]
                if (j == n - 1):
                    j = 0
                    i += 1

def determinantOfMatrix(mat, n):
    global temp
    D = 0
    if (n == 1):
        return mat[0][0]
    sign = 1
    for f in range(n):
        getCofactor(mat, temp, 0, f, n)
        D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1)
        sign = -sign
    return D


def display(mat, row, col):
    for i in range (row):
        print mat[i]
mat = [[1, 0, 2, -1],
    [3, 0, 0, 5],
    [2, 1, 4, -3],
    [1, 0, 5, 0]]
print("Determinant of the matrix is : " + str(determinantOfMatrix(mat, N)))
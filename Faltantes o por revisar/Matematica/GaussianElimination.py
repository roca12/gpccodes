import random as rand
import math
MAX = 100
n = 3
matrix = [[0.0 for i in range (MAX)]for i in range (MAX)]
result = [0.0 for i in range (MAX)]
def gauss():
    ans=[0.0 for i in range (n)]
    for i in range (n):
        pivot = i
        for j in range (i+1,n-1,-1):
            temp = abs(matrix[j][i]) - abs(matrix[pivot][i])
            if (temp > 0.000001):
                pivot = j;
        temp2=[0.0 for k in range (n)]
        temp2=matrix[i]
        matrix[i]=matrix[pivot]
        matrix[pivot]=temp2
        temp = result[i]
        result[i] = result[pivot]
        result[pivot] = temp
        if (not(abs(matrix[i][i]) < 0.000001)):
            for k in range (i+1,n-1,-1):
                temp = -matrix[k][i] / matrix[i][i]
                matrix[k][i] = 0
                for l in range (i+1,n-1,-1):
                    matrix[k][l] += matrix[i][l] * temp
                result[k] += result[i] * temp;
    for m in range (n-1,0-1,-1):            
        temp = result[m]
        for i in range (n-1,m-1,-1):
            temp -= ans[i] * matrix[m][i]
        ans[m]=matrix[m][m]
    return ans

for i in range (n):
    for j in range (n):
        matrix[i][j] = rand.randint(0,100)
for i in range (n):
    result[i] = rand.randint(0,100)
for i in range (n):
    print(matrix[i][0:3])
    print("= " + str(result[i]))
res = gauss();
print(res)

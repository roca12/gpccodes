import math
def binomialCoeff(n, k):
    C = [[0 for i in range(k + 1)] for i in range (n + 1)]
    for i in range (n+1):
        aux=min(i, k)
        for j in range (aux+1):
            if (j == 0 or j == i):
                C[i][j] = 1
            else:
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
    return C[n][k];

def k_Leaves(n, k):
    ans = (binomialCoeff(n, k) * binomialCoeff(n, k - 1)) / n
    print("Number of trees having 4 edges and exactly 2 leaves : "+ str(ans))

def numberOfNodes(n, d):
    ans = binomialCoeff(2 * n - 1 - d, n - 1);
    print("Number of nodes of degree 1 in a tree having 4 edges : "+ str(ans))

def rootDegreeR(n, r):
    ans = r * binomialCoeff(2 * n- 1 - r, n - 1)
    ans = ans / n
    print("Number of trees having 4 edges where root has degree 2 : "+ str(ans))

k_Leaves(3, 2); 
numberOfNodes(3, 1); 
rootDegreeR(3, 2);
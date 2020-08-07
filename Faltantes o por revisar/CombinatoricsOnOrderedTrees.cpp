#include<bits/stdc++.h> 
#include<cstdlib>
using namespace std;

int binomialCoeff(int n, int k) {
    int C [n + 1][k + 1]={0};
    int i, j;
    for (i = 0; i <= n; i++) {
        for (j = 0; j <= min(i, k); j++) {
            if (j == 0 || j == i) {
                C[i][j] = 1;
            } else {
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
    }
    return C[n][k];
}

static int k_Leaves(int n, int k) {
    int ans = (binomialCoeff(n, k)
            * binomialCoeff(n, k - 1)) / n;
    cout << "Number of trees having 4 edges and exactly 2 leaves : "
            << ans << endl;
    return 0;
}

static int numberOfNodes(int n, int d) {
    int ans = binomialCoeff(2 * n - 1 - d,n - 1);
    cout << "Number of nodes of degree 1 in a tree having 4 edges : "
            << ans << endl;
    return 0;
}

static int rootDegreeR(int n, int r) {
    int ans = r * binomialCoeff(2 * n
            - 1 - r, n - 1);
    ans = ans / n;
    cout << "Number of trees having 4 edges where root has degree 2 : "
            << ans << endl;
    return 0;
}

int main() {
    k_Leaves(3, 2);
    numberOfNodes(3, 1);
    rootDegreeR(3, 2);
}
#include <iostream>
#include <string.h>

using namespace std;

int maxium(int a, int b){
    return (a > b) ? a : b;
}

int LCS(char X[], char Y[], int m, int n){
    int L[m+1][n+1];
    int i, j;
    for(i = 0; i <= m; i++){
        for(j = 0; j <= n; j++){
            if(i == 0 || j == 0)
                L[i][j] = 0;
            else if(X[i - 1]==Y[j - 1])
                L[i][j] = L[i - 1][j - 1] + 1;
            else
                L[i][j] = maxium(L[i - 1][j], L[i][j - 1]);
        }
    }
    return L[m][n];
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    string a, b;
    while(getline(cin, a) && getline(cin, b) && !cin.eof()){
        int m = strlen(a.c_str());
        int n = strlen(b.c_str());
        char first[m];
        char second[n];
        strcpy(first, a.c_str());
        strcpy(second, b.c_str());
        cout<<LCS(first, second, m, n)<<endl;
    }
    return 0;
}

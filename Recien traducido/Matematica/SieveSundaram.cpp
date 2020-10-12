
#include <bits/stdc++.h> 
using namespace std;

int SieveOfSundaram(int n) {

    int nNew = (n - 1) / 2;
    bool marked[nNew + 1];
    memset(marked, false, sizeof (marked));
    for (int i = 1; i <= nNew; i++)
        for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
            marked[i + j + 2 * i * j] = true;
    if (n > 2)
        cout << 2 << " ";
    for (int i = 1; i <= nNew; i++)
        if (marked[i] == false)
            cout << 2 * i + 1 << " ";
}

int main(void) {
    int n = 20;
    SieveOfSundaram(n);
    return 0;
} 
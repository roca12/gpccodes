#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
long c[100];

static void coef(int n) {
    c[0] = 1;
    for (int i = 0; i < n; c[0] = -c[0], i++) {
        c[1 + i] = 1;
        for (int j = i; j > 0; j--)
            c[j] = c[j - 1] - c[j];
    }
}

bool isPrime(int n) {
    coef(n);
    c[0]++;
    c[n]--;
    int i = n;
    while ((i--) > 0 && c[i] % n == 0);
    return i < 0;
}

int main() {
    int n = 37;
    if (isPrime(n))
        cout << "Primo" << endl;
    else
        cout << "No es primo" << endl;
}
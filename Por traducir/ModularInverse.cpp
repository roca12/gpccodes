#include <bits/stdc++.h> 
using namespace std;
int x, y;

static int extendedEuclid(int a, int b) {
    if (b == 0) {
        x = 1;
        y = 0;
        return a;
    }
    int d = extendedEuclid(b, a % b);
    int aux = x;
    x = y;
    y = aux - ((a / b) * y);
    return d;
}

long modInverse(int a, int mod) {
    long d = extendedEuclid(a, mod);
    if (d > 1) {
        return -1;
    }
    return (x % mod + mod) % mod;
}

void modInverse(int mod) {
    int inv[mod];
    inv[1] = 1;
    for (int i = 2; i < mod; i++) {
        inv[i] = (mod - (mod / i) * inv[mod % i] % mod) % mod;
    }
}

int main() {
    cout << modInverse(3, 7) << endl;
}


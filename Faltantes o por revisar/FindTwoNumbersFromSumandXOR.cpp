#include <bits/stdc++.h> 
#include <cstdlib>
using namespace std;

void compute(long S, long X) {
    long A = (S - X) / 2;
    int a = 0, b = 0;
    const int LONG_FIELD_SIZE = 8;
    for (int i = 0; i < 8 * LONG_FIELD_SIZE; i++) {
        long Xi = (X & (1 << i));
        long Ai = (A & (1 << i));
        if (Xi == 0 && Ai == 0) {
        } else if (Xi == 0 && Ai > 0) {
            a = ((1 << i) | a);
            b = ((1 << i) | b);
        } else if (Xi > 0 && Ai == 0) {
            a = ((1 << i) | a);
        } else {
            cout << "Not Possible" << endl;
            return;
        }
    }
    cout << "a = " << a << "\nb = " << b << endl;
}

int main() {
    long S = 17, X = 13;
    compute(S, X);
}
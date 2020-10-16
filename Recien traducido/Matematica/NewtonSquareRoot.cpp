#include <bits/stdc++.h> 
using namespace std;

double squareRoot(double n, float l) {
    double x = n;
    double root;
    int count = 0;

    while (1) {
        count++;
        root = 0.5 * (x + (n / x));
        if (abs(root - x) < l)
            break;
        x = root;
    }

    return root;
}

int main() {
    double n = 327;
    float l = 0.00001;
    cout << squareRoot(n, l);
    return 0;
} 
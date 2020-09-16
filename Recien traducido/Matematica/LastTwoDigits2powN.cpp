#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;

int power(long x, long y, long p) {
    int res = 1;
    x = x % p;
    while (y > 0) {
        long r = y & 1;
        if (r == 1) {
            res = (res * (int) x) % (int) p;
        }
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}

int numberOfDigits(int x) {
    int i = 0;
    while (x != 0) {
        x /= 10;
        i++;
    }
    return i;
}

void LastTwoDigit(int n) {
    cout << "Last " << 2 <<"digits of " << 2 << "^";
    cout << n << " = ";
    int temp = 1;
    for (int i = 1; i <= 2; i++) {
        temp *= 10;
    }
    temp = power(2, n, temp);
    for (int i = 0;
            i < (2 - numberOfDigits(temp)); i++) {
        cout << 0 << " ";
    }
    if (temp != 0) {
        cout << temp << endl;
    }
}

int main() {
    int n = 72;
    LastTwoDigit(n);
}

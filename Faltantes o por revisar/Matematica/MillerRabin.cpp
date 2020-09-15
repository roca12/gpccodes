#include <bits/stdc++.h> 
using namespace std;
long modmul(long a, long b, long mod) {
    long x = 0;
    long y = a % mod;
    while (b > 0) {
        if (b % 2 == 1) {
            x = (x + y) % mod;
        }
        y = (y << 1) % mod;
        b >>= 1;
    }
    return x % mod;
}

long modpow(long a, long b, long mod) {
    if (b == 0) {
        return 1;
    }
    if (b % 2 == 0) {
        long temp = modpow(a, b / 2, mod);
        return (temp * temp) % mod;
    } else {
        long temp = modpow(a, b - 1, mod);
        return (temp * a) % mod;
    }
}
bool isPrime(long p) {
    if (p < 2 || (p != 2 && p % 2 == 0)) {
        return false;
    }
    long s = p - 1;
    while (s % 2 == 0) {
        s /= 2;
    }
    for (int i = 0; i < 5; i ++) {
        long a = (long) (0.5 * p) % (p - 1) + 1;
        long temp = s;
        long mod = modpow(a, temp, p);
        while (temp != p - 1 && mod != 1 && mod != p - 1) {
            mod = modmul(mod, mod, p);
            temp *= 2;
        }
        if (mod != p - 1 && temp % 2 == 0) {
            return false;
        }
    }
    return true;
}




int main() {
    for (int i = 0; i < 100; i++) {
        cout<<i << " " << isPrime(i)<<endl;
    }
}

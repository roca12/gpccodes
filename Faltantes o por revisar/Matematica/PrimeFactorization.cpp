#include <bits/stdc++.h> 
using namespace std;
int const MAX = 1000000;
int SQRT = 1000;
vector<int> primes;
bool marked[MAX + 1];
vector<int> factors;

void primeFactors(int n) {
    factors.clear();
    for (int i = 0, p = primes[i]; p * p <= n; p = primes[++i]) {
        while (n % p == 0) {
            factors.emplace_back(p);
            n /= p;
        }
    }
    if (n > 1) {
        factors.emplace_back(n);
    }
}

void sieve() {
    marked[1] = true;
    int i = 2;
    for (; i <= SQRT; ++i) {
        if (!marked[i]) {
            primes.emplace_back(i);
            for (int j = i * i; j <= MAX; j += i) {
                marked[j] = true;
            }
        }
    }
    for (; i <= MAX; ++i) {
        if (!marked[i]) {
            primes.emplace_back(i);
        }
    }
}

int main() {
    sieve();
    primeFactors(100);
    for (int i : factors) {
        cout << i << " ";
    }
    cout << endl;
}

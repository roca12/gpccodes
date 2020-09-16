#include <bits/stdc++.h> 
#include <cstdlib>
using namespace std;

long fib(long n, long m) {
    long a = 0, b = 1, c;
    int log2 = (int) (log(n) / log(2));
    for (int i = log2; i >= 0; i--) {
        c = a;
        a = ((c % m) * (2 * (b % m) - (c % m) + m)) % m;
        b = ((c % m) * (c % m) + (b % m) * (b % m)) % m;
        if (((n >> i) & 1) != 0) {
            c = (a + b) % m;
            a = b;
            b = c;
        }
    }
    return a;
}

int main (){
    cout<<fib(20,4)<<endl;
}
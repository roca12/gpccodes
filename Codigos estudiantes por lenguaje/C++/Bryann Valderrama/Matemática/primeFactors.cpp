#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

void primeFactors(int n)
{
    for (long p = 2; p * p <= n; p++)
    {
        while (n % p == 0)
        {
            cout << p << endl;
            n /= p;
        }
    }
    if (n > 1)
    {
        cout << n << endl;
    }
}

int main(int argc, char const *argv[])
{
    primeFactors(190);
    return 0;
}

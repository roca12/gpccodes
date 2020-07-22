#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x)
{
    if (x < 2)
    {
        return false;
    }
    if (x == 2)
    {
        return true;
    }
    for (int i = 2; i * i <= x; i++)
    {
        if (x % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main(int argc, char const *argv[])
{
    int n = 18;
    if (isPrime(n))
    {
        cout << "Es Primo" << endl;
    }
    else
    {
        cout << "No es Primo" << endl;
    }
    return 0;
}

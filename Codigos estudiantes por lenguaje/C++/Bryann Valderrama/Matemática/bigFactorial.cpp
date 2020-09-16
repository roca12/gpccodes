#include <cstdlib>
#include <bits/stdc++.h>
#define FAST                          \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(0);
using namespace std;

int multiply(int x, int res[], int res_size)
{
    int carry = 0;
    for (int i = 0; i < res_size; i++)
    {
        int prod = res[i] * x + carry;
        res[i] = prod % 10;
        carry = prod / 10;
    }
    while (carry != 0)
    {
        res[res_size] = carry % 10;
        carry /= 10;
        res_size++;
    }
    return res_size;
}

void factorial(int n)
{
    int res[10000]; //Número max de Digitos de n!
    res[0] = 1;
    int res_size = 1;
    for (int i = 2; i <= n; i++)
    {
        res_size = multiply(i, res, res_size);
    }
    cout << "Factorial de " << n << " es:" << endl;
    for (int i = res_size - 1; i >= 0; i--)
    {
        cout << res[i];
    }
}

int main(int argc, char const *argv[])
{
    factorial(100);
    return 0;
}

#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

void solution(int a, int b, int n)
{
    for (int i = 0; i * a <= n; i++)
    {
        if ((n - (i * a)) % b == 0)
        {
            cout << "x = " << i << ", y = " << (n - (i * a)) / b << endl;
            return;
        }
    }
    cout << "Sin solucion" << endl;
}

int main(int argc, char const *argv[])
{
    int a = 2;
    int b = 3;
    int n = 10;
    solution(a, b, n);
    return 0;
}

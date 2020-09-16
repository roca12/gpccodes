#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int next(int a, int k, int d[], int n)
{
    int j = a - 1; //posicion anterior de "a"
    for (int i = 0; i < k;)
    {
        j = (j + 1) % n;
        if (d[j] != -1)
        {
            i++;
        }
    }
    cout << "Next = " << j << endl;
    return j;
}

int josephus(int n, int k)
{
    int d[n + 1];
    d[0] = -1; //Cuando comienza desde 1
    for (int i = 1; i <= n; i++)
    {
        d[i] = i;
    }
    int indice = n;
    int a = 0; //calculo de la posicion siguiente a saltar
    while (indice != 1)
    {
        indice--;
        a = next(a, k, d, n + 1);
        d[a] = -1;
        a++;
    }
    for (indice = 0; d[indice] == -1; indice++)
        ;
    return d[indice];
}

int josephusModular(int n, int k)
{
    int f = 0;
    for (int i = 1; i <= n; i++)
    {
        f = (f + k) % i;
    }
    return f + 1;
}

int main(int argc, char const *argv[])
{
    ios_base::sync_with_stdio(false);
    cout.tie(NULL);
    cout << josephusModular(6, 2) << endl;
    cout << josephus(6, 2) << endl;
    return 0;
}

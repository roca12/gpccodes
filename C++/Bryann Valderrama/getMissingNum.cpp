#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int getMissingNum(int lista[], int n)
{
    int x1 = lista[0];
    int x2 = 1;
    for (int i = 1; i < n; i++)
    {
        x1 = x1 ^ lista[i];
    }
    for (int i = 2; i <= n + 1; i++)
    {
        x2 = x2 ^ i;
    }
    return x1 ^ x2;
}

int main(int argc, char const *argv[])
{
    int lista[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
    int missed = getMissingNum(lista, sizeof(lista) / sizeof(lista[0]));
    cout << "Numero perdido: " << missed << endl;
    return 0;
}

#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

bool findPair(int lista[], int x, int tamanio)
{
    int i = 0, j = 0;
    while (i < tamanio && j < tamanio)
    {
        if (i != j && lista[j] - lista[i] == x)
        {
            cout << "Par encontrado (" << lista[j] << "-" << lista[i] << ")" << endl;
            return true;
        }
        else if (lista[j] - lista[i] < x)
        {
            j++;
        }
        else
        {
            i++;
        }
    }
    cout << "No existe el par que logre ser igual a n al restar" << endl;
    return false;
}

int main(int argc, char const *argv[])
{
    int lista[] = {1, 3, 4, 5, 8, 10, 11};
    int x;
    cin >> x;
    findPair(lista, x, sizeof(lista) / sizeof(lista[0]));
    return 0;
}

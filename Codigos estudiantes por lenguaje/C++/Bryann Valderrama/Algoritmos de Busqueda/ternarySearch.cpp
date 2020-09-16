#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int ternarySearch(int izq, int der, int num, int lista[])
{
    if (der >= izq)
    {
        int mid1 = izq + (der - izq) / 3;
        int mid2 = der - (der - izq) / 3;
        if (lista[mid1] == num)
        {
            return mid1;
        }
        if (lista[mid2] == num)
        {
            return mid2;
        }
        if (num < lista[mid1])
        {
            return ternarySearch(izq, mid1 - 1, num, lista);
        }
        else if (num > lista[mid2])
        {
            return ternarySearch(mid2 + 1, der, num, lista);
        }
        else
        {
            return ternarySearch(mid1 + 1, mid2 - 1, num, lista);
        }
    }
    return -1;
}

int main(int argc, char const *argv[])
{
    int izq, der, resultado, numeroabuscar;
    int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    izq = 0;
    der = (sizeof(lista) / sizeof(lista[0])) - 1;
    cin >> numeroabuscar;
    resultado = ternarySearch(izq, der, numeroabuscar, lista);
    if (resultado == -1)
    {
        cout << "El elemento no esta en la lista" << endl;
    }
    else
    {
        cout << "Encontrado en el indice " << resultado << endl;
    }
    return 0;
}

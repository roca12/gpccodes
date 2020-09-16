#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

static int binarySearch(int lista[], int izq, int der, int numeroabuscar)
{
    if (der >= izq)
    {
        int medio = izq + (der - izq) / 2;
        if (lista[medio] == numeroabuscar)
        {
            return medio;
        }
        if (lista[medio] > numeroabuscar)
        {
            return binarySearch(lista, izq, medio - 1, numeroabuscar);
        }
        else
        {
            return binarySearch(lista, medio + 1, der, numeroabuscar);
        }
    }
    return -1;
}

int main()
{
    int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int tamanio = sizeof(lista) / sizeof(lista[0]);
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = binarySearch(lista, 0, tamanio - 1, numeroabuscar);
    if (resultado == -1)
    {
        cout << "Elemento no presente" << endl;
    }
    else
    {
        cout << "Elemento encontrado en el indice: " << resultado << endl;
    }
    return 0;
}

#include <iostream>
using namespace std;

int binarySearch(int lista[], int izq, int der, int numeroabuscar)
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

int exponentialSearch(int lista[], int n, int x)
{
    if (lista[0] == x)
    {
        return 0;
    }
    int i = 1;
    while (i < n && lista[i] <= x)
    {
        i = i * 2;
    }
    return binarySearch(lista, i / 2, min(i, n), x);
}

int main(int argc, char const *argv[])
{
    int lista[] = {1, 2, 3, 4, 5, 6, 7};
    int tamanio = sizeof(lista) / sizeof(lista[0]);
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = exponentialSearch(lista, tamanio, numeroabuscar);
    if (resultado < 0)
    {
        cout << "El resultado no esta presente en el Array" << endl;
    }
    else
    {
        cout << "Elemento encontrado en el indice " << resultado << endl;
    }
    return 0;
}

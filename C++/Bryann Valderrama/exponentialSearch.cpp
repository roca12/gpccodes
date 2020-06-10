#include <iostream>
using namespace std;

int binarySearch(int arr[], int inicio, int fin, int numeroabuscar)
{
    if (fin >= inicio)
    {
        int medio = inicio + (fin - 1) / 2;
        if (arr[medio] == numeroabuscar)
        {
            return medio;
        }
        if (arr[medio] > numeroabuscar)
        {
            return binarySearch(arr, inicio, medio - 1, numeroabuscar);
        }
        else
        {
            return binarySearch(arr, medio + 1, fin, numeroabuscar);
        }
    }
    return -1;
}

static int exponentialSearch(int arr[], int n, int x)
{
    if (arr[0] == x)
    {
        return 0;
    }
    int i = 1;
    while (i < n && arr[i] <= x)
    {
        i = i * 2;
    }
    return binarySearch(arr, i / 2, min(i, n), x);
}

int main(int argc, char const *argv[])
{
    int arr[] = {1, 2, 3, 4, 5};
    int tamanio = sizeof(arr) / sizeof(arr[0]);
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = exponentialSearch(arr, tamanio, numeroabuscar);
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

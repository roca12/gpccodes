#include <cstdio>

static int binarySearch(int arr[], int inicio, int fin, int numeroabuscar)
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

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int tamanio = sizeof(arr) / sizeof(arr[0]);
    int numeroabuscar = 3;
    int resultado = binarySearch(arr, 0, tamanio - 1, numeroabuscar);
    if (resultado == -1)
    {
        printf("elemento no presente");
    }
    else
    {
        printf("elemento encontrado en el indice: %d", resultado);
    }
    return 0;
}

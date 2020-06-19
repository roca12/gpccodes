#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {

        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int jumpSearch(int lista[], int x, int tamanio)
{
    int salto = (int)floor(sqrt(tamanio));
    int previo = 0;
    while (lista[min(salto, tamanio) - 1] < x)
    {
        previo = salto;
        salto = (int)salto + (int)floor(sqrt(tamanio));
        if (previo >= tamanio)
        {
            return -1;
        }
    }
    while (lista[previo] < x)
    {
        previo++;
        if (previo == min(salto, tamanio))
        {
            return -1;
        }
    }
    if (lista[previo] == x)
    {
        return previo;
    }
    return -1;
}

int caso = 1;
int main(int argc, char const *argv[])
{
    while (!cin.eof())
    {
        int n, q;
        cin >> n;
        cin >> q;
        int lista1[n];
        int lista2[q];
        if (n == 0 && q == 0)
        {
            break;
        }
        for (int i = 0; i < n; i++)
        {
            cin >> lista1[i];
        }
        for (int j = 0; j < q; j++)
        {
            cin >> lista2[j];
        }
        int tam = sizeof(lista1) / sizeof(lista1[0]);
        int tam2 = sizeof(lista2) / sizeof(lista2[0]);

        quickSort(lista1, 0, tam - 1);
        cout << "CASE# " << caso << ":" << endl;
        for (int k = 0; k < tam2; k++)
        {
            int resultado = jumpSearch(lista1, lista2[k], tam);
            if (resultado == -1)
            {
                cout << lista2[k] << " not found" << endl;
            }
            else
            {
                cout << lista2[k] << " found at " << resultado + 1 << endl;
            }
        }
        caso++;
    }
    return 0;
}

#include <iostream>
using namespace std;

struct Pair
{
    int min;
    int max;
};

static Pair getMaxMin(int lista[], int n)
{
    Pair minmax;
    int i;
    if (n == 1)
    {
        minmax.max = lista[0];
        minmax.min = lista[0];
        return minmax;
    }
    if (lista[0] > lista[1])
    {
        minmax.max = lista[0];
        minmax.min = lista[1];
    }
    else
    {
        minmax.max = lista[1];
        minmax.min = lista[0];
    }
    for (i = 2; i < n; i++)
    {
        if (lista[i] > minmax.max)
        {
            minmax.max = lista[i];
        }
        else if (lista[i] < minmax.min)
        {
            minmax.min = lista[i];
        }
    }
    return minmax;
}

int main(int argc, char const *argv[])
{
    int lista[] = {4, 1, 6, 3, 8, 2};
    int tamanio = sizeof(lista) / sizeof(lista[0]);
    Pair resultado = getMaxMin(lista, tamanio);
    cout << "El minimo resultado es " << resultado.min << endl;
    cout << "El maximo resultado es " << resultado.max << endl;
    return 0;
}

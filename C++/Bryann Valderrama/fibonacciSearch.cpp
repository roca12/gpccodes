#include <iostream>
using namespace std;

static int minimo(int x, int y)
{
    if (x <= y)
    {
        return x;
    }
    else
    {
        return y;
    }
}

static int fibonacciSearch(int lista[], int x, int n)
{
    if (x > lista[n - 1])
    {
        return -1;
    }

    int fibo1 = 0;
    int fibo2 = 1;
    int fiboM = fibo1 + fibo2;

    while (fiboM < n)
    {
        fibo2 = fibo1;
        fibo1 = fiboM;
        fiboM = fibo2 + fibo1;
    }

    int offset = -1;

    while (fiboM > 1)
    {
        int i = minimo(offset + fibo2, n - 1);
        if (lista[i] < x)
        {
            fiboM = fibo1;
            fibo1 = fibo2;
            fibo2 = fiboM - fibo1;
            offset = i;
        }
        else if (lista[i] > x)
        {
            fiboM = fibo2;
            fibo1 = fibo1 - fibo2;
            fibo2 = fiboM - fibo1;
        }
        else
        {
            return i;
        }
    }
    if (fibo1 == 1 && lista[offset + 1] == x)
    {
        return offset + 1;
    }
    return -1;
}

int main(int argc, char const *argv[])
{
    int lista[] = {10, 13, 15, 18, 24, 27, 39, 40, 45, 60, 79, 80, 90, 100};
    int tamanio = sizeof(lista) / sizeof(lista[0]);
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = fibonacciSearch(lista, numeroabuscar, tamanio);
    if (resultado == -1)
    {
        cout << "No encontrado";
    }
    else
    {
        cout << "Encontrado en la posicion " << resultado << endl;
    }
    return 0;
}

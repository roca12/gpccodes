#include <iostream>
#include <cmath>

using namespace std;

int jumpSearch(int lista[], int x)
{
    int tamanio = sizeof(lista) / sizeof(lista[0]);
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

int main(int argc, char const *argv[])
{
    int lista[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = jumpSearch(lista, numeroabuscar);
    if (resultado == -1)
    {
        cout << "No encontrado" << endl;
    }
    else
    {
        cout << "Encontrado en el indice " << resultado << endl;
    }
    return 0;
}

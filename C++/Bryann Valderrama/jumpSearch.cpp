#include <cstdlib>
#include <bits/stdc++.h>

using namespace std;

int jumpSearch(int lista[], int x, int n) {
    int salto = (int) floor(sqrt(n));
    int previo = 0;
    while (lista[min(salto, n) - 1] < x) {
        previo = salto;
        salto = (int) salto + (int) floor(sqrt(n));
        if (previo >= n) {
            return -1;
        }
    }
    while (lista[previo] < x) {
        previo++;
        if (previo == min(salto, n)) {
            return -1;
        }
    }
    if (lista[previo] == x) {
        return previo;
    }
    return -1;
}

int main(int argc, char const *argv[]) {
    int lista[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
    int numeroabuscar;
    cin >> numeroabuscar;
    int resultado = jumpSearch(lista, numeroabuscar, sizeof (lista) / sizeof (lista[0]));
    if (resultado == -1) {
        cout << "No encontrado" << endl;
    } else {
        cout << "Encontrado en el indice " << resultado << endl;
    }
    return 0;
}

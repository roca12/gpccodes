//Si se trabaja desde 0 dejar = en for linea 55 y 66
//Si se trabaja desde 1 dejar <=

#include <cstdlib>
#include <bits/stdc++.h>
#define MAXIM 105
using namespace std;

int previo[MAXIM];
int distancia[MAXIM];
int vertices;
vector<vector<pair<int, int>>> adyacencia(MAXIM);

void init()
{
    for (int i = 0; i <= vertices; i++)
    {
        distancia[i] = INT_MAX;
        previo[i] = -1;
    }
}

void printPath(int destino)
{
    if (previo[destino] != -1)
    {
        printPath(previo[destino]);
    }
    cout << destino << " ";
}

bool relajacion(int actual, int adyacente, int peso)
{
    if (distancia[actual] + peso < distancia[adyacente])
    {
        distancia[adyacente] = distancia[actual] + peso;
        previo[adyacente] = actual;
        return true;
    }
    return false;
}

void bellmanFord(int inicial)
{
    init();
    distancia[inicial] = 0;
    for (int i = 0; i < vertices; i++)
    {
        for (int actual = 0; actual < vertices; actual++)
        {
            for (int j = 0; j < adyacencia[actual].size(); j++)
            {
                int adyacente = adyacencia[actual][j].first;
                int peso = adyacencia[actual][j].second;
                relajacion(actual, adyacente, peso);
            }
        }
    }
    for (int actual = 0; actual < vertices; actual++)
    {
        for (int j = 0; j < adyacencia[actual].size(); j++)
        {
            int adyacente = adyacencia[actual][j].first;
            int peso = adyacencia[actual][j].second;
            if (relajacion(actual, adyacente, peso))
            {
                cout << "Existe ciclo negativo" << endl;
                return;
            }
        }
    }
    cout << "No existe ciclo negativo" << endl;
    cout << "Distancias mas cortas desde el nodo " << inicial << endl;
    for (int i = 0; i < vertices; i++)
    {
        printf("Nodo %d, distancia mas corta = %d\n", i, distancia[i]);
    }
    cout << "Camino mas corto hasta un destino: ";
    int destino;
    cin >> destino;
    printPath(destino);
    cout << endl;
}

int main(int argc, char const *argv[])
{
    int E, origen, destino, peso, inicial;
    cin >> vertices;
    cin >> E;
    for (int i = 0; i < E; i++)
    {
        cin >> origen;
        cin >> destino;
        cin >> peso;
        adyacencia[origen].push_back(make_pair(destino, peso)); //Dirigido
        //adyacencia[destino].push_back(make_pair(origen, peso)); //No Dirigido
    }
    cout << "Ingrese el nodo inicial: ";
    cin >> inicial;
    bellmanFord(inicial);
    return 0;
}

#include <bits/stdc++.h>
#include <cstdlib>
#define MAXIM 10005
#define INF 1 << 30
using namespace std;

struct Caminos
{
    int destino, peso;
    bool operator<(const Caminos &other) const
    {
        if (peso > other.peso)
            return 1;
        if (peso == other.peso)
            return 0;
        return -1;
    }
};

vector<vector<Caminos>> ady(MAXIM);
int distancia[MAXIM];
bool visited[MAXIM];
priority_queue<Caminos> Q;
int V;
int previo[MAXIM];

void init()
{
    memset(distancia, MAXIM, sizeof distancia);
    memset(visited, false, sizeof visited);
    memset(previo, -1, sizeof previo);
}

void relajacion(int actual, int adyacente, int peso)
{
    if (distancia[actual] + peso < distancia[adyacente])
    {
        distancia[adyacente] = distancia[actual] + peso;
        previo[adyacente] = actual;
        Q.push(Caminos{adyacente, distancia[adyacente]});
    }
}

void print(int destino)
{
    if (previo[destino] != -1)
    {
        print(previo[destino]);
    }
    cout << destino << " ";
}

void dijkstra(int inicial)
{
    init();
    Q.push(Caminos{inicial, 0});
    distancia[inicial] = 0;
    int actual, adyacente, peso;
    while (!Q.empty())
    {
        Caminos nodo = Q.top();
        actual = nodo.destino;
        Q.pop();
        if (visited[actual])
        {
            continue;
        }
        visited[actual] = true;
        for (int i = 0; i < ady[actual].size(); i++)
        {
            adyacente = ady[actual][i].destino;
            peso = ady[actual][i].peso;
            if (!visited[adyacente])
            {
                relajacion(actual, adyacente, peso);
            }
        }
    }
    cout << "Distancia mas corta iniciada desde " << inicial << endl;
    for (int i = 0; i < V; i++)
    {
        cout << "Vertice " << i << " distancia mas corta = " << distancia[i] << endl;
    }
    cout << "Impresion del camino mas corto hasta: ";
    int destino;
    cin >> destino;
    print(destino);
    cout << endl;
}

int main(int argc, char const *argv[])
{
    int E, origen, destino, peso, inicial;
    cin >> V >> E;
    for (int i = 0; i < E; i++)
    {
        cin >> origen >> destino >> peso;
        ady[origen].push_back(Caminos{destino, peso}); //Dirigido
        ady[destino].push_back(Caminos{origen, peso}); //No Dirigido
    }
    cout << "Inserte el vertice inicial: ";
    cin >> inicial;
    dijkstra(inicial);
    return 0;
}

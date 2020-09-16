#include<bits/stdc++.h>
//---------------//
#define MAX 105
using namespace std;
int previo[MAX];
int distancia[MAX];

void init(int vertices) {
    for (int i = 0; i <= vertices; i++) {
        distancia[i] = INT_MAX;
        previo[i] = -1;
    }
}

void printPath(int destino) {
    if (previo[destino] != -1)printPath(previo[destino]);
    printf("%d ", destino);
}

bool relajacion(int actual, int adyacente, int peso) {
    if (distancia[actual] + peso < distancia[adyacente]) {
        distancia[adyacente] = distancia[actual] + peso;
        previo[adyacente] = actual;
        return true;
    }
    return false;
}
vector<vector<pair <int, int> > >ady(MAX);

void BellmanFord(int inicial, int vertices) {
    init(vertices);
    distancia[inicial] = 0;
    for (int i = 0; i < vertices; i++) {
        for (int actual = 0; actual < vertices; actual++) {
            for (int j = 0; j < ady[actual].size(); j++) {
                int adyacente = ady[actual][j].first;
                int peso = ady[actual][j].second;
                relajacion(actual, adyacente, peso);
            }
        }
    }
    for (int actual = 0; actual < vertices; actual++) {
        for (int j = 0; j < ady[actual].size(); j++) {
            int adyacente = ady[actual][j].first;
            int peso = ady[actual][j].second;
            if (relajacion(actual, adyacente, peso)) {
                printf("Existe ciclo negativo\n");
                return;
            }
        }
    }
    printf("No existe ciclo negativo\ndistancias mas corta desde el nodo %d", inicial);
    for (int i = 0; i <= vertices; i++) {
        printf("nodo %d distancia mas corta = %d\n", i, distancia[i]);
    }
    printf("camino mas corto hasta un destino\n");
    int destino;
    cin>>destino;
    printPath(destino);
    cout << endl;
}

int main() {
    int E, origen, destino, peso, inicial, vertices;
    cin >> vertices>>E;
    for (int i = 0; i < E; i++) {
        cin >> origen >> destino>>peso;
        ady[origen].push_back(make_pair(destino, peso)); //dirigido
        ady[destino].push_back(make_pair(origen,peso));//NO dirigido
    }
    printf("Nodo inicial : ");
    cin>>inicial;
    BellmanFord(inicial, vertices);
}

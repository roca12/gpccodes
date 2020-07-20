#include <bits/stdc++.h>
#include <cstdlib>
#define MAX_V 10001

using namespace std;

bool visitados[MAX_V];
int total = 0;
vector<vector<int>> matriz(MAX_V);

void DFS(int u){
    total++;
    visitados[u] = true;
    for(int v = 0; v < matriz[u].size(); v++){
        if(!visitados[matriz[u][v]]){
            DFS(matriz[u][v]);
        }
    }
}

int main()
{
    int dominos, caminos, consultas, desde, hasta, origen;
    scanf("%i %i %i", &dominos, &caminos, &consultas);
    while(caminos > 0){
        scanf("%i %i", &desde, &hasta);
        matriz[desde].push_back(hasta);
        caminos--;
    }
    while(consultas > 0){
        scanf("%i", &origen);
        total = 0;
        memset(visitados, false, sizeof (visitados));
        DFS(origen);
        printf("Total dominos tumbados: %i \n", total);
        consultas--;
    }
    return 0;
}

#include <cstdlib>
#include <bits/stdc++.h>
#define MAX_V 101
using namespace std;

int G[MAX_V][MAX_V];

int main(int argc, char const *argv[])
{
    int V, E;
    scanf("%i %i", &V, &E);
    G[V][V];
    for (int i = 0; i < V; i++)
    {
        memset(G, -1, sizeof(G));
    }
    for (int i = 0; i < V; i++)
    {
        G[i][i] = 0;
    }
    for (int i = 0; i < E; i++)
    {
        int desde, hasta, peso;
        scanf("%i %i %i", &desde, &hasta, &peso);
        G[desde][hasta] = peso;
        G[hasta][desde] = peso;
    }
    for (int i = 0; i < V; i++)
    {
        for (int j = 0; j < V; j++)
        {
            if (G[i][j] == -1)
            {
                cout << "inf \t";
            }
            else
            {
                cout << G[i][j] << "\t";
            }
        }
        cout << endl;
    }

    return 0;
}

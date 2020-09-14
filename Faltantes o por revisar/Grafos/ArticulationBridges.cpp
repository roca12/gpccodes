#include <cstdlib>
#include <bits/stdc++.h>
#define  MAX 105
using namespace std;

struct Graph {
    int V;
    vector<int> adj[MAX];
    int time = 0;
    int NIL = -1;

    void addEdge(int v, int w) {
        adj[v].emplace_back(w);
        adj[w].emplace_back(v);
    }

    void APUtil(int u, bool visited[], int disc[],
            int low[], int parent[], bool ap[]) {
        static int time = 0;
        int children = 0;
        visited[u] = true;
        disc[u] = low[u] = ++time;
        for (int i = 0; i < adj[u].size(); i++) {
            int v = adj[u].at(i);
            if (!visited[v]) {
                children++;
                parent[v] = u;
                APUtil(v, visited, disc, low, parent, ap);
                low[u] = min(low[u], low[v]);
                if (parent[u] == NIL && children > 1)
                    ap[u] = true;
                if (parent[u] != NIL && low[v] >= disc[u])
                    ap[u] = true;
            } else if (v != parent[u])
                low[u] = min(low[u], disc[v]);
        }
    }

    void AP() {
        bool visited[V];
        int disc[V];
        int low [V];
        int parent[V];
        bool ap[V];
        for (int i = 0; i < V; i++) {
            parent[i] = NIL;
            visited[i] = false;
            ap[i] = false;
        }
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                APUtil(i, visited, disc, low, parent, ap);
        for (int i = 0; i < V; i++)
            if (ap[i] == true)
                cout << i << " ";
    }


};

int main() {
    // Create graphs given in above diagrams 
    cout << "Puntos de articulación en el grafo" << endl;
    Graph g1;
    g1.V = 5;
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    g1.AP();
    cout << endl;

    cout << "Puntos de articulación en el grafo" << endl;
    Graph g2;
    g2.V = 4;
    g2.addEdge(0, 1);
    g2.addEdge(1, 2);
    g2.addEdge(2, 3);
    g2.AP();
    cout << endl;

    cout << "Puntos de articulación en el grafo" << endl;
    Graph g3;
    g3.V=7;
    g3.addEdge(0, 1);
    g3.addEdge(1, 2);
    g3.addEdge(2, 0);
    g3.addEdge(1, 3);
    g3.addEdge(1, 4);
    g3.addEdge(1, 6);
    g3.addEdge(3, 5);
    g3.addEdge(4, 5);
    g3.AP();
}


#include<iostream> 
#include <list> 
#define NIL -1 
#define MAX 10000
using namespace std;

struct Graph {
    int V;
    list<int> adj[MAX];

    void addEdge(int v, int w) {
        adj[v].push_back(w);
        adj[w].push_back(v);
    }

    void bridgeUtil(int u, bool visited[], int disc[],
            int low[], int parent[]) {
        static int time = 0;
        visited[u] = true;
        disc[u] = low[u] = ++time;
        list<int>::iterator i;
        for (i = adj[u].begin(); i != adj[u].end(); ++i) {
            int v = *i;
            if (!visited[v]) {
                parent[v] = u;
                bridgeUtil(v, visited, disc, low, parent);
                low[u] = min(low[u], low[v]);
                if (low[v] > disc[u])
                    cout << u << " " << v << endl;
            } else if (v != parent[u])
                low[u] = min(low[u], disc[v]);
        }
    }

    void bridge() {
        bool visited[V];
        int disc [V];
        int low [V];
        int parent[V];

        for (int i = 0; i < V; i++) {
            parent[i] = NIL;
            visited[i] = false;
        }
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                bridgeUtil(i, visited, disc, low, parent);
    }
};

int main() {
    cout << "\nBridges in first graph \n";
    Graph g1;
    g1.V = 5;
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    g1.bridge();

    cout << "\nBridges in second graph \n";
    Graph g2;
    g2.V = 2;
    g2.addEdge(0, 1);
    g2.addEdge(1, 2);
    g2.addEdge(2, 3);
    g2.bridge();
}

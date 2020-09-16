#include <bits/stdc++.h>
#define MAX_V 101
using namespace std;

struct Graph{
    int V;
    vector <int> adj[MAX_V];

    void addEdge(int v, int w){
        adj[v].push_back(w);
    }
    void DFSUtil(int v, bool visited[]){
        visited[v] = true;
        cout << v << " ";
        for(int i : adj[v]){
            if(!visited[i]){
                DFSUtil(i, visited);
            }
        }
    }
    void DFS(int v){
        bool visited[V];
        memset(visited, false, V);
        DFSUtil(v, visited);
    }
};

int main()
{
    Graph g;
    g.V = 4;
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
    int inicial = 1;
    cout << "Siguiendo la DFS desde el nodo "<< inicial << endl;
    g.DFS(inicial);
    return 0;
}

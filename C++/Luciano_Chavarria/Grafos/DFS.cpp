#include <bits/stdc++.h>
#define MAX_V 101
//typedef pair Edge;
using namespace std;
vector<int> adj[MAX_V];

struct Graph {
    int V;
    void addEdge(int v, int w) {
        adj[v].push_back(w);
    }
    void DFSUtil(int v, bool visited[]) {
        visited[v] = true;
        cout << v << " ";
        for (int i = 0; i < adj[v].size(); ++i) {
            int n = adj[v][i];
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
    void DFS(int v) {
        bool visited[V];
        DFSUtil(v, visited);
    }
};

int main() {
    Graph gra;
    gra.V=4;
    gra.addEdge(0, 1);
    gra.addEdge(0, 2);
    gra.addEdge(1, 2);
    gra.addEdge(2, 0);
    gra.addEdge(2, 3);
    gra.addEdge(3, 3);
    int initial = 0;
    gra.DFS(initial);
    return 0;
}

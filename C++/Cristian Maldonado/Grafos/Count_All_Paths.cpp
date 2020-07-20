#include <bits/stdc++.h>
#include <cstdlib>
#define MAX_V 101
using namespace std;

vector <int> adj[MAX_V];
struct Graph{
    int V;

    void addEdge(int v, int w){
        adj[v].push_back(w);
    }
    int countPathsUtil(int u, int d, bool visited[], int pathCount){
        visited [u] = true;
        if(u == d){
            pathCount++;
        }else{
            for(int i = 0; i < adj[u].size(); i++){
                int n = adj[u][i];
                if(!visited[n]){
                    pathCount = countPathsUtil(n, d, visited, pathCount);
                }
            }
        }
        visited[u] = false;
        return pathCount;
    }
    int countPaths(int s, int d){
        bool visited[V];
        memset(visited, false, sizeof visited);
        int pathCount = 0;
        pathCount = countPathsUtil(s, d, visited, pathCount);
        return pathCount;
    }

};

int main()
{
    Graph g;
    g.V = 4;
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(0, 3);
    g.addEdge(1, 3);
    g.addEdge(2, 3);
    g.addEdge(2, 1);
    int s = 0, d = 3;
    cout << g.countPaths(s, d) << endl;
    return 0;
}

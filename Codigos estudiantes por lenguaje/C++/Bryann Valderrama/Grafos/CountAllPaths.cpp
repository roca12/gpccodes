#include <cstdlib>
#include <bits/stdc++.h>
#define MAXIM 101
using namespace std;
vector<int> adj[MAXIM];

struct Graph
{
    int V;

    void addEdge(int v, int w)
    {
        adj[v].push_back(w);
    }

    int countPathsUtil(int u, int d, bool visited[], int pathCount)
    {
        visited[u] = true;
        if (u == d)
        {
            pathCount++;
        }
        else
        {
            for (int i = 0; i < adj[u].size(); i++)
            {
                int n = adj[u][i];
                if (!visited[n])
                {
                    pathCount = countPathsUtil(n, d, visited, pathCount);
                }
            }
        }
        visited[u] = false;
        return pathCount;
    }

    int countPaths(int s, int d)
    {
        bool visited[V];
        memset(visited, false, sizeof visited);
        int pathcount = 0;
        pathcount = countPathsUtil(s, d, visited, pathcount);
        return pathcount;
    }
};

int main(int argc, char const *argv[])
{
    Graph g;
    g.V = 4;
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(0, 3);
    g.addEdge(2, 0);
    g.addEdge(2, 1);
    g.addEdge(1, 3);
    int s = 2, d = 3;
    cout << g.countPaths(s, d) << endl;
    return 0;
}

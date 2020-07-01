#include <cstdlib>
#include <bits/stdc++.h>
#define MAXIM 101
using namespace std;
vector<vector<int>> adj(MAXIM);

struct Graph
{
    int V;

    void addEdge(int source, int dest)
    {
        adj[source].push_back(dest);
    }

    bool isCyclicUtil(int i, bool visited[], bool recStack[])
    {
        if (recStack[i])
        {
            return true;
        }
        if (visited[i])
        {
            return false;
        }
        visited[i] = true;
        recStack[i] = true;
        vector<int> children = adj[i];
        for (int c = 0; c < children.size(); c++)
        {
            if (isCyclicUtil(children[c], visited, recStack))
            {
                return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    bool isCyclic()
    {
        bool visited[V];
        bool recStack[V];
        memset(visited, false, sizeof visited);
        memset(recStack, false, sizeof recStack);
        for (int i = 0; i < V; i++)
        {
            if (isCyclicUtil(i, visited, recStack))
            {
                return true;
            }
        }
        return false;
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
    if (g.isCyclic())
    {
        cout << "El grafo Si contiene un ciclo" << endl;
    }
    else
    {
        cout << "El grafo No contiene un ciclo" << endl;
    }
    return 0;
}

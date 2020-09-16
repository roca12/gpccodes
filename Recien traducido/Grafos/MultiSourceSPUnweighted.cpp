#include<bits/stdc++.h> 
using namespace std;
#define N 1000000 

int dist[N];
bool visited[N];

void addEdge(vector<int> graph[], int u, int v) {
    graph[u].push_back(v);
    graph[v].push_back(u);
}


void Multisource_BFS(vector<int> graph[], queue<int>q) {
    while (!q.empty()) {
        int k = q.front();
        q.pop();

        for (auto i : graph[k]) {
            if (!visited[i]) {
                q.push(i);
                dist[i] = dist[k] + 1;
                visited[i] = true;
            }
        }
    }
}



void nearestTown(vector<int> graph[], int n, int sources[], int s) {
    queue<int> q;
    for (int i = 0; i < s; i++) {
        q.push(sources[i]);
        visited[sources[i]] = true;
    }
    Multisource_BFS(graph, q);
    for (int i = 1; i <= n; i++) {
        cout << i << " " << dist[i] << endl;
    }

}




int main() {
    int n = 6;
    vector<int> graph[n + 1];
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 6);
    addEdge(graph, 2, 6);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 6);
    addEdge(graph, 5, 4);
    addEdge(graph, 6, 5);
    addEdge(graph, 3, 4);
    addEdge(graph, 5, 3);
    int sources[] = {1, 5};
    int S = sizeof (sources) / sizeof (sources[0]);
    nearestTown(graph, n, sources, S);
    return 0;
}

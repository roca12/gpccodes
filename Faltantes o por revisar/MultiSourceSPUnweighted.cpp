// CPP program to demonstrate Multi-source BFS 
#include<bits/stdc++.h> 
using namespace std;
#define N 1000000 

// This array stores the distances of the vertices 
// from the nearest source 
int dist[N];

//This boolean array is true if the current vertex 
// is visited otherwise it is false 
bool visited[N];

void addEdge(vector<int> graph[], int u, int v) {
    //Function to add 2 edges in an undirected graph 
    graph[u].push_back(v);
    graph[v].push_back(u);
}

// Multisource BFS Function 

void Multisource_BFS(vector<int> graph[], queue<int>q) {
    while (!q.empty()) {
        int k = q.front();
        q.pop();

        for (auto i : graph[k]) {
            if (!visited[i]) {

                // Pushing the adjacent unvisited vertices 
                // with distance from current source = this 
                // vertex's distance + 1 
                q.push(i);
                dist[i] = dist[k] + 1;
                visited[i] = true;
            }
        }
    }
}


// This function calculates the distance of each 
// vertex from nearest source 

void nearestTown(vector<int> graph[], int n, int sources[], int s) {
    //Create a queue for BFS 
    queue<int> q;

    //Mark all the source vertices as visited and enqueue it 
    for (int i = 0; i < s; i++) {
        q.push(sources[i]);
        visited[sources[i]] = true;
    }

    Multisource_BFS(graph, q);


    //Printing the distances 
    for (int i = 1; i <= n; i++) {
        cout << i << " " << dist[i] << endl;
    }

}


// Driver code 

int main() {
    // Number of vertices 
    int n = 6;

    vector<int> graph[n + 1];

    // Edges 
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 6);
    addEdge(graph, 2, 6);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 6);
    addEdge(graph, 5, 4);
    addEdge(graph, 6, 5);
    addEdge(graph, 3, 4);
    addEdge(graph, 5, 3);

    // Sources 
    int sources[] = {1, 5};

    int S = sizeof (sources) / sizeof (sources[0]);

    nearestTown(graph, n, sources, S);

    return 0;
}

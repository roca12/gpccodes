#include<bits/stdc++.h>
//--------------//
#define INF 9999
using namespace std;

const int V=4;
int siguiente[V][V];

void printPath(vector<int> path) {
    int n = path.size();
    for (int i = 0; i < n - 1; i++) {
        cout<<path[i]<<" -> ";
    }
    cout<<path[n-1]<<endl;
}
int constructPath(int u,int v){
    if(siguiente[u][v]==-1){
        return 0;
    }
    vector<int>path;
    path.push_back(u);
    while(u != v){
        u = siguiente[u][v];
        path.push_back(u);
    }
    cout << "Camino mas corto desde 0 a 3:"<<endl;
    printPath(path);
    return 1;
}
void printSolution(int dist[V][V]) {
       cout<<"La siguiente matriz muestra las distancias mas cortas entre cada par de vertices\n";
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF) {
                    cout<<"INF \t";
                } else {
                    cout<<dist[i][j]<<"\t";
                }
            }
            cout<<endl;
        }
    }
void floydWarshall(int graph[V][V]) {
        int dist[V][V];
        int i, j, k;
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
                if (graph[i][j] == INF) {
                    siguiente[i][j] = -1;
                } else {
                    siguiente[i][j] = j;
                }
            }
        }
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] == INF|| dist[k][j] == INF) {
                        continue;
                    }
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        siguiente[i][j] = siguiente[i][k];
                    }
                }
            }
        }
        printSolution(dist);
    }
int main() {
    int E,a,b,c;
    cin>>E;
    int graph[V][V];
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            graph[i][j]=INF;
        }
    }
    for(int i=0;i<V;i++){
        graph[i][i]=0;
    }
    for(int i=0;i<E;i++){
        cin>>a>>b>>c;
        graph[a][b]=c;
    }
    floydWarshall(graph);
    constructPath(0,3);
}

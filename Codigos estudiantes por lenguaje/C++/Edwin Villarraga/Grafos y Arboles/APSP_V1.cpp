#include<bits/stdc++.h>
#include<cstdlib>
#define INF 9999
using namespace std;
const int V=4;
void printSolution(int dist[V][V]) {
       cout<<"La siguiente matriz muestra las distancias más cortas entre cada par de vertices\n";
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF) {
                    cout<<"INF ";
                } else {
                    cout<<dist[i][j]<<" ";
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
            }
        }
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {

                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
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

}

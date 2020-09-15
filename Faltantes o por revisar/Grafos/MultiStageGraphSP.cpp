#include<bits/stdc++.h> 
using namespace std;
#define N 8
#define INF INT_MAX

int shortestDist(int graph[7][8]) {
    int dist [N];
    dist[N - 1] = 0;

    for (int i = N - 2; i >= 0; i--) {
        dist[i] = INF;
        for (int j = i; j < N; j++) {
            if (graph[i][j] == INF) {
                continue;
            }
            dist[i] = min(dist[i], graph[i][j]
                    + dist[j]);
        }
    }
    return dist[0];
}

int main() {
        int graph[7][8] = {
        {INF, 1, 2, 5, INF, INF, INF, INF},
        {INF, INF, INF, INF, 4, 11, INF, INF},
        {INF, INF, INF, INF, 9, 5, 16, INF},
        {INF, INF, INF, INF, INF, INF, 2, INF},
        {INF, INF, INF, INF, INF, INF, INF, 18},
        {INF, INF, INF, INF, INF, INF, INF, 13},
        {INF, INF, INF, INF, INF, INF, INF, 2}};

        cout<<shortestDist(graph)<<endl;
    return 0;
}

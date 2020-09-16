#include <bits/stdc++.h>
#define MAX_V 101
using namespace std;
vector<int> adj[MAX_V];
vector<int>que;
struct Graph {
    int V;
    void addEdge(int v, int w) {
        adj[v].push_back(w);
    }
    void BFS(int s){
        bool visited[V];
        visited[s]=true;
        que.push_back(s);
        while(!que.empty()){
            s=que.front();
            que.erase(que.begin());
            cout<<s<<" ";
            for(int i=0;i<adj[s].size();++i){
                int n=adj[s][i];
                if(!visited[n]){
                    visited[n]=true;
                    que.push_back(n);
                }
            }
        }
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
    gra.BFS(initial);
    return 0;
}

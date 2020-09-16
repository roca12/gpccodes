#include <bits/stdc++.h>
#define MAX 101
using namespace std;
vector<vector<int> >adj(MAX);
int in[MAX];
void clean(){
    for(int i=0;i<MAX;i++){
        adj[i].clear();
    }
    memset(in,0,sizeof in);
}
struct Graph{
    int V;
    void addEdge(int v, int w) {
        adj[v].push_back(w);
        adj[w].push_back(v);
    }
    void DFSUtil(int v, bool visited[]) {
        visited[v] = true;
        int n;
        for(int i=0;i<adj[v].size();++i){
            n = adj[v][i];
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
     bool isConnected() {
            bool visited[V];
            int i;
            memset(visited, false,sizeof visited);
            for (i = 0; i < V; i++) {
                if (!adj[i].empty()) {
                    break;
                }
            }
            if (i == V) {
                return true;
            }
            DFSUtil(i, visited);
            for (i = 0; i < V; i++) {
                if (visited[i] == false && adj[i].size() > 0) {
                    return false;
                }
            }
            return true;
        }

        int isEulerian() {
            if (isConnected() == false) {
                return 0;
            }
            int odd = 0;
            for (int i = 0; i < V; i++) {
                if (adj[i].size() % 2 != 0) {
                    odd++;
                }
            }
            if (odd > 2) {
                return 0;
            }
            return (odd == 2) ? 1 : 2;
        }
         void test() {
            int res = isEulerian();
            switch (res) {
                case 0:
                    cout<<"Grafo no euleriano"<<endl;
                    break;
                case 1:
                    cout<<"Grafo tiene camino de euler"<<endl;
                    break;
                case 2:
                    cout<<"Grafo tiene ciclo de euler"<<endl;
                    break;
            }
        }
        void init(){
        adj.clear();
        memset(in,0,sizeof in);
    }

};
int main() {
    Graph g1;
    g1.init();
    g1.V=5;
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    g1.test();
    clean();
    Graph g2;
    g2.init();
    g2.V=5;
    g2.addEdge(1, 0);
    g2.addEdge(0, 2);
    g2.addEdge(2, 1);
    g2.addEdge(0, 3);
    g2.addEdge(3, 4);
    g2.addEdge(4, 0);
    g2.test();
    clean();
    Graph g3;
    g3.init();
    g3.V=5;
    g3.addEdge(1, 0);
    g3.addEdge(0, 2);
    g3.addEdge(2, 1);
    g3.addEdge(0, 3);
    g3.addEdge(3, 4);
    g3.addEdge(1, 3);
    g3.test();
    clean();
    Graph g4;
    g4.init();
    g4.V=3;
    g4.addEdge(0, 1);
    g4.addEdge(1, 2);
    g4.addEdge(2, 0);
    g4.test();
    Graph g5;
    g5.init();
    g5.V=3;
    g5.test();
    clean();
}

//Recorrido de un camino que pasa por todos los
//vertices hasta volver al inicial dado un grafo dirigido

#include <bits/stdc++.h>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);

using namespace std;

const int MAX_V = 90;

struct Graph{
    int V;
    vector<int> adj[MAX_V];
    int in[MAX_V];

    Graph(int v){
        V = v;
        for(int i = 0; i < V; i++){
            in[i] = 0;
        }
    }

    void addEdge(int source, int destiny){
        adj[source].push_back(destiny);
        in[destiny]++;
    }

    void DFSUtil(int v, bool visited[]){
        visited[v] = true;
        int n;
        for(int i = 0; i < adj[v].size(); ++i){
            n = adj[v][i];
            if(!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }
    Graph getTranspose(){
        Graph ge(V);
        for(int v = 0; v < V; v++){
            for(int i : adj[v]){
                ge.adj[i].push_back(v);
                ge.in[v]++;
            }
        }
        return ge;
    }

    bool isSC(){
        bool visited[V];
        memset(visited, false, V);
        DFSUtil(0, visited);
        for(int i = 0; i < V; i++){
            if(visited[i] == false){
                return false;
            }
        }
        Graph gr = getTranspose();
        memset(visited, false, sizeof visited);
        gr.DFSUtil(0, visited);
        for(int i = 0; i < V; i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }

    bool isEulerian(){
        if(isSC() == false){
            return false;
        }
        for(int i = 0; i < V; i++){
            if(adj[i].size() != in[i]){
                return false;
            }
        }
        return true;
    }
};

int main()
{
    FAST
    int vertices, caminos;
    cin >> vertices >> caminos;
    Graph g(vertices);
    for(int i = 0; i < caminos; i++){
        int inicio, destino;
        cin >> inicio >> destino;
        g.addEdge(inicio, destino);
    }
    if(g.isEulerian()){
        cout << "El grafo dado es Euleriano" << endl;
    }else{
        cout << "El grafo dado no es Euleriano" << endl;
    }
    return 0;
}

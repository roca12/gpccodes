#include <bits/stdc++.h>

using namespace std;

const int MAX_V = 90;

struct Graph{
    int V;
    vector<int> adj[MAX_V];

    //Agregar caminos
    void addEdge(int v, int w){
        adj[v].push_back(w);
        adj[w].push_back(v); //El grafo es no dirigido
    }

    void DFSUtil(int v, bool visited[]){
        visited[v] = true;
        for(int i: adj[v]){
            if(!visited[i]){
                DFSUtil(i, visited);
            }
        }
    }

    bool isConnected(){
        bool visited [V];
        int i;
        memset(visited, false, V);
        for(i = 0; i < V; i++){
            if(!adj[i].empty()){
                break;
            }
        }
        //Si no hay caminos en el grafo, retorna true
        if(i == V){
            return true;
        }
        DFSUtil(i, visited);
        for(i = 0; i < V; i++){
            if(visited[i] == false && adj[i].size() > 0){
                return false;
            }
        }
        return true;
    }

    int isEulerian(){
        if(isConnected() == false){
            return 0;
        }
        //Cuenta vertices con grado impar
        int odd = 0;
        for(int i = 0; i < V; i++){
            if(adj[i].size() % 2 != 0){
                odd++;
            }
        }
        //Si cuenta es mayor a 2, el grafo no es Euleriano
        if(odd > 2){
            return 0;
        }
        //Si odd es 2, se puede decir que es semiEuleriano
        //Si odd es 0, es Euleriano
        return (odd == 2) ? 1 : 2;
    }

    void test(){
        int res = isEulerian();
        switch(res){
        case 0:
            cout << "El grafo no es Euleriano" << endl;
            break;
        case 1:
            cout << "El grafo tiene un camino de Euler" << endl;
            break;
        default:
            cout << "El grafo contiene ciclo de Euler" << endl;
            break;
        }
    }
};

int main()
{
    //Creamos varios ejemplos de grafos para probar
    Graph g1;
    g1.V = 5;
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    g1.test();
    Graph g2;
    g2.V = 5;
    g2.addEdge(1, 0);
    g2.addEdge(0, 2);
    g2.addEdge(2, 1);
    g2.addEdge(0, 3);
    g2.addEdge(3, 4);
    g2.addEdge(4, 0);
    g2.test();
    Graph g3;
    g3.V = 5;
    g3.addEdge(1, 0);
    g3.addEdge(0, 2);
    g3.addEdge(2, 1);
    g3.addEdge(0, 3);
    g3.addEdge(3, 4);
    g3.addEdge(1, 3);
    g3.test();
    /*Crearemos ungrafo con tres vertices
    conectados en forma de ciclo*/
    Graph g4;
    g4.V = 3;
    g4.addEdge(0, 1);
    g4.addEdge(1, 2);
    g4.addEdge(2, 0);
    g4.test();
    // Cramos un grafo con vertices con grado cero
    Graph g5;
    g5.V = 3;
    g5.test();
    return 0;
}

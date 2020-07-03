#include <bits/stdc++.h>
#include <cstdlib>
#define MAX_V 101

using namespace std;

const int V = 5;
int path[MAX_V];

bool isSafe(int v, int graph[V][V], int path[], int pos){
    if(graph[path[pos - 1]][v] == 0){
        return false;
    }
    for(int i = 0; i < pos; i++){
        if(path[i] == v){
            return false;
        }
    }
    return true;
}

bool hamCycleUtil(int graph[V][V], int path[], int pos){
    if(pos == V){
        return graph[path[pos - 1]][path[0]] == 1;
    }
    for(int v = 1; v < V; v++){
        if(isSafe(v, graph, path, pos)){
            path[pos] = v;
            if(hamCycleUtil(graph, path, pos + 1) == true){
                return true;
            }
            path[pos] = -1;
        }
    }
    return false;
}

void printSolution(int path[]){
    cout << "Solucon existente, este es uno de los ciclos hamiltonianos" << endl;
    for(int i = 0; i < V; i++){
        cout << path[i]<<" ";
    }
    cout<<endl;
}

int hamCycle(int graph[V][V]){
    path [V];
    memset(path, -1, sizeof path);
    path[0] = 0;
    if(hamCycleUtil(graph, path, 1) == false){
        cout << "No existe ciclo hamiltoniano" << endl;
    }
    printSolution(path);
    return 1;
}


int main()
{
    int graph[5][5] = {{0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {0, 1, 1, 1, 0}};
        hamCycle(graph);
    return 0;
}

#include<bits/stdc++.h>
#define MAX 101
using namespace std;
vector<vector<int> > adj(MAX);
struct Graph{
    int V;
    void addEdge(int source,int dest){
        adj[source].push_back(dest);
    }
    bool isCycleUtil(int i,bool visited[],bool recStack[]){
        if(recStack[i]){
            return true;
        }
        if(visited[i]){
            return false;
        }
        visited[i]=true;
        recStack[i]=true;
        vector<int> children=adj[i];
        for(int c=0;c<children.size();c++){
            if(isCycleUtil(children[c],visited,recStack)){
                return true;
            }
        }
        recStack[i]=false;
        return false;
    }
    bool iscyclic(){
        bool visit[V];
        bool recStack[V];
        memset(visit,false,sizeof visit);
        memset(recStack,false,sizeof recStack);
        for(int i=0;i<V;i++){
            if(isCycleUtil(i,visit,recStack)){
                return true;
            }
        }
        return false;
    }
};

int main() {
    Graph g;
    g.V=4;
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
    if(g.iscyclic()){
        cout<<"el grafo SI tiene un ciclo";
    }else{
        cout<<"el grafo NO tiene un ciclo";
    }
    return 0;
}

#include<bits/stdc++.h>
#define MAX 10001
using namespace std;
vector <vector<int> >ady(MAX);
int total=0;
bool visited[MAX];
void DFS(int u){
    total++;
    visited[u]=true;
    for(int v=0;v<ady[u].size();v++){
        if(!visited[ady[u][v]]){
            DFS(ady[u][v]);
        }
    }

}
int main() {
    int dominos,caminos,busquedas,desde,hasta,origen;
    cin>>dominos;
    cin>>caminos;
    cin>>busquedas;
     while (caminos > 0) {
        cin>>desde>>hasta;
        ady[desde].push_back(hasta);
        caminos--;
    }
    while(busquedas){
        cin>>origen;
        total=0;
        memset(visited,0,sizeof visited);
        DFS(origen);
        cout<<"Dominos tumbados : "<<total<<endl;
        busquedas--;
    }
    return 0;
}

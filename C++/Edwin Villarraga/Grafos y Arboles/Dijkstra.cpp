#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
#define MAX 10005
#define INF 1<<30
//---------------//
using namespace std;
struct Node{
    int destino,peso;
    bool operator < (const Node &other) const{
        if(peso>other.peso)return 1;
        if(peso == other.peso) return 0;
        return -1;
    }
};
vector <vector<Node> >ady(MAX);
int distancia[MAX];
bool visited[MAX];
priority_queue<Node> Q;
int previo[MAX];
void init(){
    memset(distancia,MAX,sizeof distancia);
    memset(visited,false,sizeof visited);
    memset(previo,-1,sizeof previo);
}
//Revisa cual es el camino mas corto
void relajacion(int actual, int adyacente, int peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            Q.push(Node{adyacente, distancia[adyacente]});
        }
    }
 void print(int destino) {
        if (previo[destino] != -1) {
            print(previo[destino]);
        }
        cout<<destino<<" ";
    }
void dijkstra(int inicial,int V){
    init();
    Q.push(Node{inicial,0});
    distancia[inicial]=0;
    int actual,adyacente,peso;
    while(!Q.empty()){
        Node nodo=Q.top();
        actual=nodo.destino;
        Q.pop();
        if(visited[actual]){continue;}
        visited[actual]=true;
        for(int i=0;i<ady[actual].size();i++){
            adyacente=ady[actual][i].destino;
            peso=ady[actual][i].peso;
            if(!visited[adyacente]){
                relajacion(actual,adyacente,peso);
            }
        }
    }
    cout<<"distancia mas corta iniciada desde "<<inicial<<endl;
    for(int i=0;i<=V;i++){
        cout<<"vertice "<<i<<" distancia mas corta = "<<distancia[i]<<endl;
    }
    cout<<"impresion del camino mas corto"<<endl;
    int destino;
    cin>>destino;
    print(destino);
    cout<<endl;
}
int main() {
    int V,E,origen,destino,peso,inicial;
    cin>>V>>E;
    for(int i=0;i<E;i++){
        cin>>origen>>destino>>peso;
        ady[origen].push_back(Node{destino,peso});//dirigido
        //ady[destino].push_back(Node{origen,peso});// no dirigido
    }
    cout<<"Inserte el verice inicial"<<endl;
    cin>>inicial;
    dijkstra(inicial,V);
}

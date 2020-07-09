#include <bits/stdc++.h>
#define MAX 1005
using namespace std;
int padre[MAX];
//set de nodos para indicar cuales son sus padre e hijos
void makeSet(int n){
    for(int i=0;i<=n;i++){
        padre[i]=i;
    }
}
int find(int x){
    return (x==padre[x]?x:(padre[x]=find(padre[x])));
}
void Union(int x,int y){
    padre[find(x)]=find(y);
}
bool sameComponent(int x,int y){
    if(find(x)==find(y)){
        return true;
    }
    return false;
}
struct Edge{
  int origen,destino,peso;
};
Edge aristas[MAX];
Edge MST[MAX];
bool compare(const Edge &t,const Edge &t1){
    return t.peso-t1.peso;
}
vector<Edge>vec;
void KruskalMST(int V,int E){
    int origen,destino,peso;
    int total=0;
    int numAristas=0;
    makeSet(V);
    sort(vec.begin(),vec.end(),compare);
    for(int i=0;i<E;i++){
        origen=vec[i].origen;
        destino=vec[i].destino;
        peso=vec[i].peso;
        if(!sameComponent(origen,destino)){
            total+=peso;
            MST[numAristas++]=vec[i];
            Union(origen,destino);
        }
    }
    if(V-1!=numAristas){
        cout<<"No existe MST valido para el grafo ingresado este debe ser conexo"<<endl;
        return;
    }
    cout<<"MST encontrado contiene las siguientes aristas"<<endl;
    for(int i=0;i<numAristas;i++){
        cout<<MST[i].origen<<","<<MST[i].destino<<":"<<MST[i].peso<<endl;
    }
    cout<<"el costo minimo de todas las aristas de MST es : "<<total<<endl;
}

int main(){
    int V,E;
    cin>>V>>E;
    for(int i=0;i<E;i++){
        Edge aristas[i];
        cin>>aristas[i].origen;
        cin>>aristas[i].destino;
        cin>>aristas[i].peso;
        vec.push_back(aristas[i]);
    }
    KruskalMST(V,E);
}

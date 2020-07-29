#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
//---------------//
using namespace std;
typedef long long int ll;
const ll MAX =100010;
const ll INF =LLONG_MAX;
struct Node{
    ll destino,peso;
    Node(ll _destino, ll _peso) : destino(_destino), peso(_peso) {} // Constructor parametrizado.
	Node() : destino(-1), peso(-1) {} // Constructor por defecto.

};
struct State{
	ll destino; // El nodo actual.
	ll peso; // El costo del camino.
	State(ll _destino, ll _peso) : destino(_destino), peso(_peso) {} // Constructor parametrizado.
	bool operator <(const State &b) const{
		return peso > b.peso;
	}
};

vector <Node>ady[MAX];
ll distancia[MAX];
bool visited[MAX];
priority_queue<State> Q;
ll previo[MAX];
void dijkstra(ll inicial,ll V,ll y,ll minutes){
    Q.push(State{inicial,0});
    distancia[inicial]=0;
    previo[inicial]=-1;
    ll actual,adyacente,peso;
    while(!Q.empty()){
        actual=Q.top().destino;
        Q.pop();
        if(visited[actual]){continue;}
        visited[actual]=true;
        for(ll i=0;i<ady[actual].size();i++){
            adyacente=ady[actual][i].destino;
            peso=ady[actual][i].peso;
            if(!visited[adyacente]){
               if (distancia[actual] + peso < distancia[adyacente]) {
                    distancia[adyacente] = distancia[actual] + peso;
                    previo[adyacente] = actual;
                    Q.push(State{adyacente, distancia[adyacente]});
                    }
                }
            }
        }
      for(ll i=1;i<=V;i++){
        if(i==y && minutes>=distancia[i]){
        cout<<"alive "<<distancia[i]<<endl;
        return;
        }
    }
    cout<<"died"<<endl;
}
int main() {
    ll V,E,origen,destino,peso,minutos,x,y;
    cin>>V>>minutos>>E>>x>>y;
    for(ll i=1;i<=V;i++){
        distancia[i]=INF;
        previo[i]=-1;
    }
    for(ll i=0;i<E;i++){
        cin>>origen>>destino>>peso;
        ady[origen].push_back(Node{destino,peso});//dirigido
        ady[destino].push_back(Node{origen,peso});// no dirigido
    }
    dijkstra(x,V,y,minutos);
}

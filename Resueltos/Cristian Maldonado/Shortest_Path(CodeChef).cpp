#include <iostream>
#include <string.h>
#include <cstdlib>
#include <vector>
#include <queue>
//---------------//
#define MAX 100005
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
//---------------//
const int INF = 1<<30;
typedef long long int lli;
//---------------//
using namespace std;
struct Node{
    lli destino,peso;
    Node(lli _destino, lli _peso) : destino(_destino), peso(_peso) {}
	Node() : destino(-1), peso(-1) {}
};
struct State{
	lli destino;
	lli peso;
	State(lli _destino, lli _peso) : destino(_destino), peso(_peso) {}
	bool operator <(const State &b) const{
		return peso > b.peso;
	}
};
vector <vector<Node> >ady(MAX);
lli distancia[MAX];
bool visited[MAX];
priority_queue<State> Q;
lli previo[MAX];

void init(lli V){
    for(lli i=0;i<=V;i++){
        distancia[i]=INF;
    }
}
void relajacion(lli actual, lli adyacente, lli peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            Q.push(State{adyacente, distancia[adyacente]});
        }
    }
 void print(lli destino) {
        if (previo[destino] != -1) {
            print(previo[destino]);
        }
        cout<<destino<<" ";
    }

void dijkstra(lli inicial,lli V){
    init(V);
    Q.push(State{inicial,0});
    distancia[inicial]=0;
    lli actual,adyacente,peso;
    while(!Q.empty()){
        actual=Q.top().destino;
        Q.pop();
        if(visited[actual]){continue;}
        visited[actual]=true;
        for(lli i=0;i<ady[actual].size();i++){
            adyacente=ady[actual][i].destino;
            peso=ady[actual][i].peso;
            if(!visited[adyacente]){
                relajacion(actual,adyacente,peso);
            }
        }
    }
    if(distancia[V] == INF){
        cout<<-1<<endl;
        return;
    }
    print(V);
    cout<<endl;
}
int main() {
    FAST
    memset(previo,-1,sizeof previo);
    lli V,E,origen,destino,peso,inicial = 1;
    cin>>V>>E;
    for(lli i=0;i<E;i++){
        cin>>origen>>destino>>peso;
        ady[origen].push_back(Node{destino,peso});//dirigido
        ady[destino].push_back(Node{origen,peso});// no dirigido
    }
    dijkstra(inicial,V);
}

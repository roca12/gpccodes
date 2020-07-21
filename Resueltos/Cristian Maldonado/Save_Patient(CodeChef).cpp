#include<bits/stdc++.h>
#include<cstdlib>
#define MAX 10005
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);cout<<setprecision(25);
using namespace std;

typedef long long int lli;
const int INF =1<<30;

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
    for(lli i=1;i<=V;i++){
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

void dijkstra(lli inicial,lli V, lli destinoFinal, lli tiempoRestante){
    init(V);
    Q.push(State{inicial,0});
    distancia[inicial]=0;
    int actual,adyacente,peso;
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
    if(distancia[destinoFinal] <= tiempoRestante){
        cout << "alive "<<distancia[destinoFinal]<<endl;
    }else if(distancia[destinoFinal] == INF || distancia[destinoFinal] > tiempoRestante){
        cout << "died"<<endl;
    }

}
int main() {
    lli V,E,origen,destino,peso,inicial, tiempoRestante, destinoFinal;
    cin>>V>>tiempoRestante>>E>>inicial>>destinoFinal;
    for(int i=0;i<E;i++){
        cin>>origen>>destino>>peso;
        ady[origen].push_back(Node{destino,peso});//dirigido
        ady[destino].push_back(Node{origen,peso});// no dirigido
    }
    dijkstra(inicial,V, destinoFinal, tiempoRestante);
}

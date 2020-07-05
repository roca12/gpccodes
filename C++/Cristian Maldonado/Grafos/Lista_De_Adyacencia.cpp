#include<bits/stdc++.h>
#include<cstdlib>
#define MAX_V 101

using namespace std;

struct Edge{
	int to = 0, w = 0;
	Edge(int _to, int _w){
		to = _to;
		w = _w;
	}
};

struct Vertex{
	list <Edge> adj;
};

static Vertex G[MAX_V];

int main (int argc, char *argv[]) {
	int V, E;
	scanf("%i %i", &V, &E);
	for(int i = 0; i < V; i++){
		G[i] = Vertex();
	}
	for(int i = 0; i < E; i++){
		int desde, hasta, peso;
		scanf("%i %i %i", &desde, &hasta, &peso);
		G[desde].adj.push_back(Edge(hasta, peso));
		G[hasta].adj.push_back(Edge(desde, peso));
	}
	for(int i = 0; i < V; i++){
		cout << i <<"-> ";
		for(Edge e:G[i].adj){
			cout <<e.to<<" "<<e.w<<"|";
		}
		cout<<""<<endl;
	}
	return 0;
}

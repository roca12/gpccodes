#include<bits/stdc++.h>
#include<cstdlib>
#define MAX_V 101

using namespace std;

vector<int> adj[MAX_V];

struct Graph {
	int V;
	void addEdge(int v, int w) {
		V = v;
		adj[v].push_back(w);
	}
	void BFS(int s) {
		bool visited[V];
		queue <int> cola;
		visited[s] = true;
		cola.push(s);
		while(!cola.empty()){
			s = cola.front();
			cout << s <<" ";
			cola.pop();
			for(int i = 0; i < adj[s].size(); i++){
				int n = adj[s][i];
				if(!visited[n]){
					visited[n] = true;
					cola.push(n);
				}
			}
		}
	}
};

int main (int argc, char *argv[]) {
	Graph g;
	g.V = 4;
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	g.addEdge(1, 2);
	g.addEdge(2, 0);
	g.addEdge(2, 3);
	g.addEdge(3, 3);
	cout << "Sieguiendo su primera busqueda en anchura traverso (iniciando desde 2)"<<endl;
	g.BFS(2);
	return 0;
}

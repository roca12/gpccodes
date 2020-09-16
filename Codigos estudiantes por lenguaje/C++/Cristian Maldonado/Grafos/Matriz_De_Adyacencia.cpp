#include<bits/stdc++.h>
#include<cstdlib>
#define MAX 70

using namespace std;

static int G[MAX][MAX];

int main (int argc, char *argv[]) {
	memset(G, 0, sizeof G);
	int vertices = 0, caminos = 0;
	scanf("%i %i", &vertices, &caminos);
	for(int i = 0; i < caminos; i++){
		int desde = 0, hasta = 0, peso = 0;
		scanf("%i %i %i", &desde, &hasta, &peso);
		G[desde][hasta] = peso;
		G[hasta][desde] = peso;
	}
	cout<<""<<endl;
	for(int i = 0; i < vertices; i++){
		for(int j = 0; j < vertices; j++){
				printf("%i\t",G[i][j]);
		}
		cout<<""<<endl;
	}
	return 0;
}

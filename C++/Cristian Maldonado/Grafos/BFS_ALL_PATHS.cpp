// Programa para la impresion de todos los caminos
// dado un inicio y un destino dentro de un grafo
#include <bits/stdc++.h>
using namespace std;

// función de utilidad para impresion
// encontrando todos los caminos
void printpath(vector<int>& path)
{
	int size = path.size();
	for (int i = 0; i < size; i++)
		cout << path[i] << " ";
	cout << endl;
}

// Funcion para revisar si el vertice actual
// ya se encuentra presente en el camino
int isNotVisited(int x, vector<int>& path)
{
	int size = path.size();
	for (int i = 0; i < size; i++)
		if (path[i] == x)
			return 0;
	return 1;
}

// Funcion de utilidad para encontrar los caminos dentro de un grafo
// desde el inicio hasta el fin dado
void findpaths(vector<vector<int>> &g, int inicio, int destino, int v)
{
	// Crear una cola que almacena los caminos
	queue<vector<int>> q;

	// vector de caminos que almacena el camino actual
	vector<int> path;
	path.push_back(inicio);
	q.push(path);
	while (!q.empty()) {
		path = q.front();
		q.pop();
		int last = path[path.size() - 1];

		// Si el ultimo vertice es el destino deseado
		// entonces se imprime el camino

		if (last == destino)
			printpath(path);

        // Atravesar a todos los nodos conectados al vértice actual
        // y empujar una nueva ruta a la cola

		for (int i = 0; i < g[last].size(); i++) {
			if (isNotVisited(g[last][i], path)) {
				vector<int> newpath(path);
				newpath.push_back(g[last][i]);
				q.push(newpath);
			}
		}
	}
}

int main()
{
	vector<vector<int>> g;
	// Numero de vertices
	int v = 4;
	g.resize(4);

	// Contruccion del grafo
	g[0].push_back(3);
	g[0].push_back(1);
	g[0].push_back(2);
	g[1].push_back(3);
	g[2].push_back(0);
	g[2].push_back(1);

    //inicio y destino
	int inicio = 2, destino = 3;
	cout << "Los caminos desde " << inicio
		<< " hasta " << destino << " son \n";
	// Llamada a la funcion que permitirá encontrar los caminos
	// recibiendo como parametros la matriz de caminos, el inicio, el
	// y la cantidad de vertices
	findpaths(g, inicio, destino, v);
	return 0;
}


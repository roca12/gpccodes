
// CPP program to find minimum distance between 
// source and destination node and visiting 
// of intermediate node is compulsory 
#include <bits/stdc++.h> 
using namespace std; 
#define MAXN 100005 

// to strore maped values of graph 
vector<pair<int, int> > v[MAXN]; 

// to store distance of 
// all nodes from the source node 
int dist[MAXN]; 

// Dijkstra's algorithm to find 
// shortest path from source to node 
void dijkstra(int source, int n) 
{ 
	// set all the vertices 
	// distances as infinity 
	for (int i = 0; i < n; i++) 
		dist[i] = INT_MAX; 

	// set all vertex as unvisited 
	bool vis[n]; 
	memset(vis, false, sizeof vis); 

	// make distance from source 
	// vertex to source vertex is zero 
	dist = 0; 

	// // multiset do the job 
	// as a min-priority queue 
	multiset<pair<int, int> > s; 

	// insert the source node with distance = 0 
	s.insert({ 0, source }); 

	while (!s.empty()) { 
		pair<int, int> p = *s.begin(); 
		// pop the vertex with the minimum distance 
		s.erase(s.begin()); 

		int x = p.second; 
		int wei = p.first; 

		// check if the popped vertex 
		// is visited before 
		if (vis[x]) 
			continue; 

		vis[x] = true; 

		for (int i = 0; i < v[x].size(); i++) { 
			int e = v[x][i].first; 
			int w = v[x][i].second; 

			// check if the next vertex 
			// distance could be minimized 
			if (dist[x] + w < dist[e]) { 

				dist[e] = dist[x] + w; 

				// insert the next vertex 
				// with the updated distance 
				s.insert({ dist[e], e }); 
			} 
		} 
	} 
} 

// function to add edges in graph 
void add_edge(int s, int t, int weight) 
{ 
	v[s].push_back({ t, weight }); 
	v[t].push_back({ s, weight }); 
} 

// function to find the minimum shortest path 
int solve(int source, int destination, 
			int intermediate, int n) 
{ 
	int ans = INT_MAX; 

	dijkstra(source, n); 

	// store distance from source to 
	// all other vertices 
	int dsource[n]; 
	for (int i = 0; i < n; i++) 
		dsource[i] = dist[i]; 

	dijkstra(destination, n); 
	// store distance from destination 
	// to all other vertices 
	int ddestination[n]; 
	for (int i = 0; i < n; i++) 
		ddestination[i] = dist[i]; 

	dijkstra(intermediate, n); 
	// store distance from intermediate 
	// to all other vertices 
	int dintermediate[n]; 
	for (int i = 0; i < n; i++) 
		dintermediate[i] = dist[i]; 

	// find required answer 
	for (int i = 0; i < n; i++) 
		ans = min(ans, dsource[i] + ddestination[i] 
								+ dintermediate[i]); 

	return ans; 
} 

// Driver code 
int main() 
{ 

	int n = 4; 
	int source = 0, destination = 2, intermediate = 3; 

	// add edges in graph 
	add_edge(0, 1, 1); 
	add_edge(1, 2, 2); 
	add_edge(1, 3, 3); 

	// function call for minimum shortest path 
	cout << solve(source, destination, intermediate, n); 

	return 0; 
} 

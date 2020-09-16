// A C++ Program to generate test cases for 
// an unweighted tree 
#include<bits/stdc++.h> 
using namespace std;

// Define the number of runs for the test data 
// generated 
#define RUN 5 

// Define the maximum number of nodes of the tree 
#define MAXNODE 20 

//array containing adjacency lists
list<int> adj[200];

struct Tree {
    int V; // No. of vertices 

    // used by isCyclic() 
    bool isCyclicUtil(int v, bool visited[], bool recStack[]) {
        if (visited[v] == false) {
            // Mark the current node as visited and part of 
            // recursion stack 
            visited[v] = true;
            recStack[v] = true;
            // Recur for all the vertices adjacent to this vertex 
            list<int>::iterator i;
            for (i = adj[v].begin(); i != adj[v].end(); ++i) {
                if (!visited[*i] && isCyclicUtil(*i, visited, recStack))
                    return true;
                else if (recStack[*i])
                    return true;
            }
        }
        recStack[v] = false; // remove the vertex from recursion stack 
        return false;
    }

    // adds an edge 

    void addEdge(int v, int w) {
        adj[v].push_back(w); // Add w to v’s list. 
    }

    // removes an edge 

    void removeEdge(int v, int w) {
        list<int>::iterator it;
        for (it = adj[v].begin(); it != adj[v].end(); it++) {
            if (*it == w) {
                adj[v].erase(it);
                break;
            }
        }
        return;
    }
    // returns true if there is a cycle in this graph 

    bool isCyclic() {
        // Mark all the vertices as not visited and not part of recursion 
        // stack 
        bool visited[V];
        bool recStack[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            recStack[i] = false;
        }
        // Call the recursive helper function to detect cycle in different 
        // DFS trees 
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;

        return false;
    }
};

int main() {
    set<pair<int, int>> container;
    //For random values every time 
    srand(time(NULL));
    int NUM; // Number of Vertices/Nodes 
    for (int i = 1; i <= RUN; i++) {
        NUM = 1 + rand() % MAXNODE;
        // First print the number of vertices/nodes 
        printf("%d\n", NUM);
        Tree t;
        t.V = NUM;
        // Then print the edges of the form (a b) 
        // where 'a' is parent of 'b' 
        for (int j = 1; j <= NUM - 1; j++) {
            int a = rand() % NUM;
            int b = rand() % NUM;
            pair<int, int> p = make_pair(a, b);
            t.addEdge(a, b);
            // Search for a random "new" edge everytime 
            while (container.find(p) != container.end() || t.isCyclic() == true) {
                t.removeEdge(a, b);
                a = rand() % NUM;
                b = rand() % NUM;
                p = make_pair(a, b);
                t.addEdge(a, b);
            }
            container.insert(p);
        }
        for (pair<int, int> p : container) {
            printf("%d %d\n", p.first, p.second);
        }
        container.clear();
        printf("\n");
    }
}

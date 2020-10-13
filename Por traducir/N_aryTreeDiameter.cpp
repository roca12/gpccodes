// C++ implementation to find
// diameter of a tree using
// DFS in ONE TRAVERSAL

#include <bits/stdc++.h>
using namespace std;
#define maxN 10005

// The array to store the
// height of the nodes
int height[maxN];

// Adjacency List to store
// the tree
vector<int> tree[maxN];

// varaiable to store diameter
// of the tree
int diameter = 0;

// Function to add edge between
// node u to node v

void addEdge(int u, int v) {
    // add edge from u to v
    tree[u].push_back(v);

    // add edge from v to u
    tree[v].push_back(u);
}

void dfs(int cur, int par) {
    // Variables to store the height of children
    // of cur node with maximum heights
    int max1 = 0;
    int max2 = 0;

    // going in the adjacency list of the current node
    for (auto u : tree[cur]) {

        // if that node equals parent discard it
        if (u == par)
            continue;

        // calling dfs for child node
        dfs(u, cur);

        // calculating height of nodes
        height[cur] = max(height[cur], height[u]);

        // getting the height of children
        // of cur node with maximum height
        if (height[u] >= max1) {
            max2 = max1;
            max1 = height[u];
        } else if (height[u] > max2) {
            max2 = height[u];
        }
    }

    height[cur] += 1;

    // Diameter of a tree can be calculated as
    // diameter passing through the node
    // diameter doesn't includes the cur node
    diameter = max(diameter, height[cur]);
    diameter = max(diameter, max1 + max2 + 1);
}

// Driver Code

int main() {
    // n is the number of nodes in tree
    int n = 7;

    // Adding edges to the tree
    addEdge(1, 2);
    addEdge(1, 3);
    addEdge(1, 4);
    addEdge(2, 5);
    addEdge(4, 6);
    addEdge(4, 7);

    // Calling the dfs function to
    // calculate the diameter of tree
    dfs(1, 0);

    cout << "Diameter of tree is : " << diameter - 1
            << "\n";

    return 0;
}


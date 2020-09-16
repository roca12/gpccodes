// Java code to find maximum subtree such 
// that all nodes are even in weight 

public class DisjoinSetUnionTree {

    static int N = 100010;

    // Structure for Edge 
    static class Edge {
        int u, v;
        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    /* 'id': stores parent of a node. 
    'sz': stores size of a DSU tree. */
    static int[] id = new int[N];
    static int[] sz = new int[N];

    // Function to assign root 
    static int Root(int idx) {
        int i = idx;
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    // Function to find Union 
    static void Union(int a, int b) {
        int i = Root(a), j = Root(b);
        if (i != j) {
            if (sz[i] >= sz[j]) {
                id[j] = i;
                sz[i] += sz[j];
                sz[j] = 0;
            } else {
                id[i] = j;
                sz[j] += sz[i];
                sz[i] = 0;
            }
        }
    }

// Utility function for Union 
    static void UnionUtil(Edge e[], int W[], int q) {
        for (int i = 0; i < q; i++) {
            // Edge between 'u' and 'v' 
            int u, v;
            u = e[i].u;
            v = e[i].v;

            // 0-indexed nodes 
            u--;
            v--;

            // If weights of both 'u' and 'v' 
            // are even then we make union of them. 
            if (W[u] % 2 == 0 && W[v] % 2 == 0) {
                Union(u, v);
            }
        }
    }

// Function to find maximum 
// size of DSU tree 
    static int findMax(int n, int W[]) {
        int maxi = 0;
        for (int i = 1; i < n; i++) {
            if (W[i] % 2 == 0) {
                maxi = Math.max(maxi, sz[i]);
            }
        }

        return maxi;
    }

// Driver code 
    public static void main(String[] args) {
        /* 
	Nodes are 0-indexed in this code 
	So we have to make necessary changes 
	while taking inputs 
         */
        // Weights of nodes 
        int W[] = {1, 2, 6, 4, 2, 0, 3};

        // Number of nodes in a tree 
        int n = W.length;

        // Initializing every node as 
        // a tree with single node. 
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }

        Edge e[] = {new Edge(1, 2), new Edge(1, 3),
            new Edge(2, 4), new Edge(2, 5),
            new Edge(4, 6), new Edge(6, 7)};

        int q = e.length;
        UnionUtil(e, W, q);
        // Find maximum size of DSU tree. 
        int maxi = findMax(n, W);
        System.out.printf("Maximum size of the subtree with ");
        System.out.printf("even weighted nodes = %d\n", maxi);
    }
}

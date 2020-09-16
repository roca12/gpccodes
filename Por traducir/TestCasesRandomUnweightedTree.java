


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TestCasesRandomUnweightedTree {
    // Define the number of runs for the test data 
// generated 

    static int RUN = 5;

// Define the maximum number of nodes of the tree 
    static int MAXNODE = 20;

//array containing adjacency lists
    static ArrayList<Integer> adj[] = new ArrayList[200];

    static class Tree {

        int V; // No. of vertices 

        // used by isCyclic() 
        boolean isCyclicUtil(int v, boolean visited[], boolean recStack[]) {
            if (visited[v] == false) {
                // Mark the current node as visited and part of 
                // recursion stack 
                visited[v] = true;
                recStack[v] = true;
                // Recur for all the vertices adjacent to this vertex 
                Iterator<Integer> it = adj[v].iterator();
                while (it.hasNext()) {
                    int aux = it.next();
                    if (!visited[aux] && isCyclicUtil(aux, visited, recStack)) {
                        return true;
                    } else if (recStack[aux]) {
                        return true;
                    }
                }
            }
            recStack[v] = false; // remove the vertex from recursion stack 
            return false;
        }

        // adds an edge 
        void addEdge(int v, int w) {
            adj[v].add(w); // Add w to v’s list. 
        }

        // removes an edge 
        void removeEdge(int v, int w) {
            Iterator<Integer> it = adj[v].iterator();
            while (it.hasNext()) {
                int aux = it.next();
                if (aux == w) {
                    adj[v].remove(adj[v].indexOf(aux));
                    break;
                }
            }
            return;
        }
        // returns true if there is a cycle in this graph 

        boolean isCyclic() {
            // Mark all the vertices as not visited and not part of recursion 
            // stack 
            boolean visited[] = new boolean[V];
            boolean recStack[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                visited[i] = false;
                recStack[i] = false;
            }
            // Call the recursive helper function to detect cycle in different 
            // DFS trees 
            for (int i = 0; i < V; i++) {
                if (isCyclicUtil(i, visited, recStack)) {
                    return true;
                }
            }

            return false;
        }
    };

    static class Pair {

        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

    }

static int getIndex(Set<Pair> set, Pair value) {
        int result = 0;
        for (Object entry : set) {
            if (entry.equals(value)) {
                return result;
            }
            result++;
        }
        return set.size() + 1;
    }

    public static void main(String[] args) {
        HashSet<Pair> container = new HashSet<>();
        //For random values every time 
        Random r = new Random();
        Arrays.fill(adj, new ArrayList<>());
        int NUM; // Number of Vertices/Nodes 
        for (int i = 1; i <= RUN; i++) {
            NUM = 1 + r.nextInt(MAXNODE);
            // First print the number of vertices/nodes 
            System.out.printf("%d\n", NUM);
            Tree t = new Tree();
            t.V = NUM;
            // Then print the edges of the form (a b) 
            // where 'a' is parent of 'b' 
            for (int j = 1; j <= NUM - 1; j++) {
                int a = r.nextInt(NUM);
                int b = r.nextInt(NUM);
                Pair p = new Pair(a, b);
                t.addEdge(a, b);
                // Search for a random "new" edge everytime 
                while (getIndex(container, p) != container.size()+1  || t.isCyclic() == true) {
                    t.removeEdge(a, b);
                    a = r.nextInt(NUM);
                    b = r.nextInt(NUM);
                    p = new Pair(a, b);
                    t.addEdge(a, b);
                }
                container.add(p);
            }
            for (Pair p : container) {
                System.out.printf("%d %d\n", p.first, p.second);
            }
            container.clear();
            System.out.printf("\n");
        }
    }

}

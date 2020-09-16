import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
        int s = 2, d = 3;
        System.out.println(g.countPaths(s, d));
    }

    static class Graph {

        int V;
        LinkedList<Integer> adj[];

        public Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        int countPathsUtil(int u, int d, boolean visited[], int pathCount) {
            visited[u] = true;
            if (u == d) {
                pathCount++;
            } else {
                Iterator<Integer> i = adj[u].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        pathCount = countPathsUtil(n, d, visited, pathCount);
                    }
                }
            }
            visited[u] = false;
            return pathCount;
        }

        int countPaths(int s, int d) {
            boolean visited[] = new boolean[V];
            Arrays.fill(visited, false);
            int pathcount = 0;
            pathcount = countPathsUtil(s, d, visited, pathcount);
            return pathcount;
        }
    }
}

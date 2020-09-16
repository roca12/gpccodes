
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        int inicial = 0;
        System.out.println("Siguiendo la BFS desde el nodo " + inicial);
        g.BFS(inicial);
    }

    static class Graph {

        int V;//nodos
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

        void BFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<>();
            visited[s] = true;
            queue.add(s);
            while (!queue.isEmpty()) {
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }
}

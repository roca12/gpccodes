import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Siguiendo su primera busqueda en anchura traverso "+"(iniciando desde el vertice 2)");
        g.BFS(2);
    }

    static class Graph {

        private int V;
        private LinkedList<Integer> adj[];

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
                Iterator <Integer> i = adj[s].listIterator();
                while(i.hasNext()){
                    int n = i.next();
                    if(!visited[n]){
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }
}

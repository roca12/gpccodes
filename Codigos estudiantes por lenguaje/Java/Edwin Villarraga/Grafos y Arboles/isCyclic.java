
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            //graph.addEdge(2, 0);
            graph.addEdge(2, 3);
            //graph.addEdge(3, 3);
            if (graph.isCyclic()) {
                System.out.println("El grafo contiene un ciclo");
            } else {
                System.out.println("El grafo no contiene"
                        + " un ciclo");
            }

    }

    static class Graph {

        int V;
        List<List<Integer>> adj;

        public Graph(int v) {
            this.V = v;
            adj = new ArrayList<>(V);
            for (int i = 0; i < v; i++) {
                adj.add(new LinkedList<>());
            }
        }

        void addEdge(int source, int dest) {
            adj.get(source).add(dest);
        }

        boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
            if (recStack[i]) {
                return true;
            }
            if (visited[i]) {
                return false;
            }
            visited[i] = true;
            recStack[i] = true;
            List<Integer> children = adj.get(i);
            if (children.stream().anyMatch((c) -> (isCyclicUtil(c, visited, recStack)))) {
                return true;
            }
            recStack[i] = false;
            return false;
        }

        boolean isCyclic() {
            boolean[] visited = new boolean[V];
            boolean[] recStack = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (isCyclicUtil(i, visited, recStack)) {
                    return true;
                }
            }
            return false;
        }

    }
}

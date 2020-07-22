// Programa java que busca camino euleriano
// de un grafo

import java.util.Iterator;
import java.util.LinkedList;

public class Eulerian_Path_Undirected_Graph {

    public static void main(String args[]) {
        // Creamos varios ejemplos de grafos para probar
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.test();
        Graph g2 = new Graph(5);
        g2.addEdge(1, 0);
        g2.addEdge(0, 2);
        g2.addEdge(2, 1);
        g2.addEdge(0, 3);
        g2.addEdge(3, 4);
        g2.addEdge(4, 0);
        g2.test();
        Graph g3 = new Graph(5);
        g3.addEdge(1, 0);
        g3.addEdge(0, 2);
        g3.addEdge(2, 1);
        g3.addEdge(0, 3);
        g3.addEdge(3, 4);
        g3.addEdge(1, 3);
        g3.test();
        /* Crearemos un grafo con tres vertices
        conectados en forma de ciclo*/
        Graph g4 = new Graph(3);
        g4.addEdge(0, 1);
        g4.addEdge(1, 2);
        g4.addEdge(2, 0);
        g4.test();
        /* Creamos un grafo con vertices con grado cero*/
        Graph g5 = new Graph(3);
        g5.test();
    }

    static class Graph {

        int V;
        LinkedList<Integer> adj[];

        // Constructor 
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
        }

        //Agregar caminos
        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v); //El grafo es no dirigido
        }

        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        boolean isConnected() {
            boolean visited[] = new boolean[V];
            int i;
            for (i = 0; i < V; i++) {
                visited[i] = false;
            }
            for (i = 0; i < V; i++) {
                if (!adj[i].isEmpty()) {
                    break;
                }
            }
            //Si no hay caminos en el grafo, retorna true
            if (i == V) {
                return true;
            }
            DFSUtil(i, visited);
            for (i = 0; i < V; i++) {
                if (visited[i] == false && adj[i].size() > 0) {
                    return false;
                }
            }
            return true;
        }

        int isEulerian() {
            if (isConnected() == false) {
                return 0;
            }
            // Cuenta vertices con grado impar 
            int odd = 0;
            for (int i = 0; i < V; i++) {
                if (adj[i].size() % 2 != 0) {
                    odd++;
                }
            }
            // Si cuenta es más de 2, el grafo no es euleriano
            if (odd > 2) {
                return 0;
            }
            //si odd es 2, es semieuleriano
            //Si odd es 0, es euleriano 
            return (odd == 2) ? 1 : 2;
        }

        void test() {
            int res = isEulerian();
            switch (res) {
                case 0:
                    System.out.println("Grafo no es Euleriano");
                    break;
                case 1:
                    System.out.println("Grafo tiene un camino de Euler");
                    break;
                default:
                    System.out.println("Grafo tiene ciclo de euler");
                    break;
            }
        }
    }
}

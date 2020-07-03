//Pasar por todos los nodos y llegar al mismo nodo, sin repetir nodo

import java.util.Arrays;

public class Main {

    static int V = 5;
    static int[] path;

    static boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }
        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }
        return true;
    }

    static boolean hamCycleUtil(int graph[][], int[] path, int pos) {
        if (pos == V) {
            return graph[path[pos - 1]][path[0]] == 1;
        }
        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamCycleUtil(graph, path, pos + 1) == true) {
                    return true;
                }
                path[pos] = -1;
            }
        }
        return false;
    }

    static int hamCycle(int graph[][]) {
        path = new int[V];
        Arrays.fill(path, -1);
        path[0] = 0;
        if (hamCycleUtil(graph, path, 1) == false) {
            System.out.println("No existe ciclo hamiltoniano");
            return 0;
        }
        printSolution(path);
        return 1;
    }

    static void printSolution(int[] path) {
        System.out.println("Solucion existente: Este es uno de los ciclos hamiltonianos ");
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws java.lang.Exception {
        /*Tenemos el siguiente grafo 
           (0)--(1)--(2) 
            |   / \   | 
            |  /   \  | 
            | /     \ | 
           (3)-------(4)    */
        int graph1[][] = {{0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {0, 1, 1, 1, 0},};
        // Imprimir solución
        hamCycle(graph1);
    }
}

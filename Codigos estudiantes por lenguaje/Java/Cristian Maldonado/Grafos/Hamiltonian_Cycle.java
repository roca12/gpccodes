import java.util.Arrays;

public class Hamiltonian_Cycle {

    static final int V = 5;
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

    static boolean hamCycleUtil(int graph[][], int path[], int pos) {
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

    static void printSolution(int path[]) {
        System.out.println("Solucion existente, este es uno de los ciclos hamiltonianos");
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println("");
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

    public static void main(String[] args) {
        int graph[][] = {{0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {0, 1, 1, 1, 0}};
        hamCycle(graph);
        int graph2[][] = {{0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 0, 1},
        {1, 1, 0, 0, 0},
        {0, 1, 1, 0, 0}};
        //Imprimir solución
        hamCycle(graph2);
    }
}

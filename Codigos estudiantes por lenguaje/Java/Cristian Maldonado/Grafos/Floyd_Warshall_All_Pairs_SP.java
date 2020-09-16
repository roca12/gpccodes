// Programa java que busca todos los caminos más cortos
// en un grafo

import java.util.ArrayList;
import java.util.Scanner;

public class Floyd_Warshall_All_Pairs_SP {

    static int INF = 9999;
    static int V = 0;
    //grafo en matriz fija
    static int[][] graph;
    //matriz que almacena el camino recorrido
    static int[][] next;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        graph = new int[V][V];
        next = new int[V][V];
        int E = sc.nextInt();
        //Inicializa todo en infinito
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = INF;
            }
        }

        // De un nodo al mismo nodo es 0
        for (int i = 0; i < V; i++) {
            graph[i][i] = 0;
        }
        for (int i = 0; i < E; i++) {
            graph[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }
        floydWarshall(graph);
        ArrayList<Integer> path;
        System.out.println("El camino mas corto desde 0 a 3: ");
        //Construit camino
        path = constructPath(0, 3);
        //imprimir camino
        printPath(path);
    }

    static void floydWarshall(int graph[][]) {
        int dist[][] = new int[V][V];
        int i, j, k;
        /*Inicialice la matriz de solución igual que 
            la matriz del gráfico de entrada. O podemos 
            decir que los valores iniciales de las distancias 
            más cortas se basan en las rutas más cortas, 
            considerando que no hay vértice intermedio. */
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
                // Si no hay camino entre i y j
                if (graph[i][j] == INF) {
                    next[i][j] = -1;
                } else {
                    next[i][j] = j;
                }
            }
        }

            /*Agregue todos los vértices uno por uno al conjunto 
            de vértices intermedios.
            ---> Antes del inicio de una iteración, tenemos 
            distancias más cortas entre todos los pares de vértices, 
            de modo que las distancias más cortas consideran solo
            los vértices en el conjunto {0, 1, 2, .. k-1} como 
            vértices intermedios.
            ----> Después del final de una iteración, el vértice 
            número k se agrega al conjunto de vértices intermedios 
            y el conjunto se convierte en {0, 1, 2, ... k} */
        for (k = 0; k < V; k++) {
            //Toma todos los vertices como inicio uno por uno
            for (i = 0; i < V; i++) {
                /* Toma todos los vertices como destino del
                    incio del origen seleccionado*/
                for (j = 0; j < V; j++) {
                    // Si vertice k esa en el camino más corto
                    // desde i a j, actualiza el valor de dist[i][j]
                    // No podemos viajar por un camino si no existe
                    if (dist[i][k] == INF|| dist[k][j] == INF) {
                        continue;
                    }
                    if (dist[i][j] > dist[i][k]+ dist[k][j]) {
                        dist[i][j] = dist[i][k]+ dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
        //Imprime la matriz de distancias cortas
        printSolution(dist);
    }

    static ArrayList<Integer> constructPath(int u, int v) {
        // si no hay camino devuelve una lista vacia
        if (next[u][v] == -1) {
            return new ArrayList<>();
        }
        // Almacenando el camino en el vector
        ArrayList<Integer> path = new ArrayList<>();
        path.add(u);
        while (u != v) {
            u = next[u][v];
            path.add(u);
        }
        return path;
    }

    static void printPath(ArrayList<Integer> path) {
        int n = path.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println(path.get(n - 1));
    }

    static void printSolution(int dist[][]) {
        System.out.println("La siguiente matriz muestra las distancias "
                + "más cortas entre cada par de vertices");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == Floyd_Warshall_All_Pairs_SP.INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

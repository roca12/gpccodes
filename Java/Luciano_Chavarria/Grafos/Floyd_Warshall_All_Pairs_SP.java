// Programa java que busca todos los caminos más cortos
// en un grafo

import java.util.Scanner;

public class Main {

    static int INF = 9999;
     static int V=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] graph;
        V = sc.nextInt();
        graph = new int[V][V];
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
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        //Imprime la matriz de distancias cortas
        printSolution(dist);
    }

    static void printSolution(int dist[][]) {
        System.out.println("La siguiente matriz muestra las distancias "
                + "más cortas entre cada par de vertices");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == Main.INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

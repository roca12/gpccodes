import java.util.*;

public class Main {

    static int INF = 9999;
    static int V = 0;
    static int[][] graph;
    static int[][] next;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        graph = new int[V][V];
        next = new int[V][V];
        int E = sc.nextInt();
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = INF;
            }
        }
        for (int i = 0; i < V; i++) {
            graph[i][i] = 0;
        }
        for (int i = 0; i < E; i++) {
            graph[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }
        floydWarshall(graph);
        ArrayList<Integer> path;
        System.out.println("El camino mas corto desde 0 a 3: ");
        path = constructPath(0, 3);
        printPath(path);
    }

    static void floydWarshall(int graph[][]) {
        int dist[][] = new int[V][V];
        int i, j, k;
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
                if (graph[i][j] == INF) {
                    next[i][j] = -1;
                } else {
                    next[i][j] = j;
                }
            }
        }
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
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
        printSolution(dist);
    }

    static ArrayList<Integer> constructPath(int u, int v) {
        if (next[u][v] == -1) {
            return new ArrayList<>();
        }
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
        System.out.println(path.get(n - 1) + " -> ");
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

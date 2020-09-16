import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    final static int V = 4;

    static boolean isBipartite(int G[][], int src) {
        int colorArr[] = new int[V];
        Arrays.fill(colorArr, -1);
        colorArr[src] = 1;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            if (G[u][u] == 1) {
                return false;
            }
            for (int v = 0; v < V; v++) {
                if (G[u][v] == 1 && colorArr[v] == -1) {
                    colorArr[v] = 1 - colorArr[u];
                    q.add(v);
                } else if (G[u][v] == 1 && colorArr[v] == colorArr[u]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int G[][] = {{0, 1, 0, 1},
        {1, 0, 1, 0},
        {0, 1, 0, 1},
        {1, 0, 1, 0}
        };
        if (isBipartite(G, 0)) {
            System.out.println("Es bipartito");
        } else {
            System.out.println("No es bipartito");
        }

    }
}

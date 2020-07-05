import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Lista_De_Adyacencia {

    static Vertex[] G;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        G = new Vertex[V];
        for (int i = 0; i < V; i++) {
            G[i] = new Vertex();
            G[i].adj = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            int desde, hasta, peso;
            desde = sc.nextInt();
            hasta = sc.nextInt();
            peso = sc.nextInt();
            G[desde].adj.add(new Edge(hasta, peso));
            G[hasta].adj.add(new Edge(desde, peso));
        }
        for (int i = 0; i < G.length; i++) {
            System.out.print(i + "-> ");
            for (Edge e : G[i].adj) {
                System.out.print(e.to + " " + e.w + "|");
            }
            System.out.println();
        }
    }

    static class Vertex {

        List<Edge> adj;

        public Vertex() {
            adj = new ArrayList<>();
        }
    }

    static class Edge {

        int to, w;

        public Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }
}

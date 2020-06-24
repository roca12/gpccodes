
package javaapplication24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matriz_adyace {
   static Vertex[] G;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int V = sc.nextInt(), E = sc.nextInt();
        G = new Vertex[V];
        for (int i = 0; i < V; i++) {
            G[i] = new Vertex();
            G[i].adj = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            int aux1, aux2, aux3;
            aux1 = sc.nextInt();
            aux2 = sc.nextInt();
            aux3 = sc.nextInt();
            //Dirijido
            G[aux1].adj.add(new Edge(aux2, aux3));
            //No dirigido
            //G[aux2].adj.add(new Edge(aux1, aux3));
        }
        for (int i = 0; i < G.length; i++) {
            System.out.print(i+"->" );
            for (Edge e : G[i].adj) {
                System.out.print(e.to + " " + e.w+"|");
            }
            System.out.println("");
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

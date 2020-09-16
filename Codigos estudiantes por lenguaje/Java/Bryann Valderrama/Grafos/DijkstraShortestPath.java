import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static final int MAX = 10005;
    static final int INF = 1 << 30;

    static class Caminos implements Comparable<Caminos> {

        int destino, peso;

        public Caminos(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;

        }

        @Override
        public int compareTo(Caminos otro) {
            if (peso > otro.peso) {
                return 1;
            }
            if (peso == otro.peso) {
                return 0;
            }
            return -1;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static List<List<Caminos>> ady = new ArrayList<List<Caminos>>();
    static int distancia[] = new int[MAX];
    static boolean visitado[] = new boolean[MAX];
    static PriorityQueue<Caminos> Q = new PriorityQueue<>();
    static int V;
    static int previo[] = new int[MAX];

    static void init() {
        for (int i = 0; i < V; i++) {
            distancia[i] = INF;
            visitado[i] = false;
            previo[i] = -1;
        }
    }

    static void relajacion(int actual, int adyacente, int peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            Q.add(new Caminos(adyacente, distancia[adyacente]));
        }
    }

    static void print(int destino) {
        if (previo[destino] != -1) {
            print(previo[destino]);
        }
        System.out.printf("%d ", destino);
    }

    static void Dijkstra(int inicial) {
        init();
        Q.add(new Caminos(inicial, 0));
        distancia[inicial] = 0;
        int actual, adyacente, peso;
        while (!Q.isEmpty()) {
            actual = Q.element().destino;
            Q.remove();
            if (visitado[actual]) {
                continue;
            }
            visitado[actual] = true;
            for (int i = 0; i < ady.get(actual).size(); i++) {
                adyacente = ady.get(actual).get(i).destino;
                peso = ady.get(actual).get(i).peso;
                if (!visitado[adyacente]) {
                    relajacion(actual, adyacente, peso);
                }
            }
        }
        System.out.println("Distancias mas cortas iniciando desde" + inicial);
        for (int i = 0; i <= V; i++) {
            System.out.printf("Vertice %d, distancia mas corta = %d\n", i, distancia[i]);
        }
        System.out.println("Impresion del camino mas corto");
        int destino;
        destino = sc.nextInt();
        print(destino);
        System.out.println("");
    }

    public static void main(String[] args) {
        int E, origen, destino, peso, inicial;
        V = sc.nextInt();
        E = sc.nextInt();
        for (int i = 0; i <= V; i++) {
            ady.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            origen = sc.nextInt();
            destino = sc.nextInt();
            peso = sc.nextInt();
            ady.get(origen).add(new Caminos(destino, peso)); //Dirigido
            ady.get(destino).add(new Caminos(origen, peso)); //No dirigido
        }
        System.out.println("Inserte el vertice inicial");
        inicial = sc.nextInt();
        Dijkstra(inicial);
    }
}

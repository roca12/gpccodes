import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static final int MAX = 10005;
    static final int INF = 1 << 30;

    static class Camino implements Comparable<Camino> {
        int destino, peso;
        public Camino(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }

        @Override
        public int compareTo(Camino otro) {
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
    static List< List< Camino>> ady = new ArrayList<List<Camino>>();
    static int[] distancia = new int[MAX];
    static boolean visitado[] = new boolean[MAX];
    static PriorityQueue<Camino> Q = new PriorityQueue<>();
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
            Q.add(new Camino(adyacente, distancia[adyacente]));
        }
    }

    static void print(int destino) {
        if (previo[destino] != -1) {
            print(previo[destino]);
        }
        System.out.printf("%d ", destino);
    }

    static void dijkstra(int inical) {
        init();
        Q.add(new Camino(inical, 0));
        distancia[inical] = 0;
        int actual, adyacente, peso;
        while (!Q.isEmpty()) {
            actual = Q.element().destino;
            Q.remove();
            if (visitado[actual]) {
                continue;
            }
            visitado[actual]=true;
            for (int i = 0; i < ady.get(actual).size(); i++) {
                adyacente=ady.get(actual).get(i).destino;
                peso=ady.get(actual).get(i).peso;
                if(!visitado[adyacente]){
                    relajacion(actual, adyacente, peso);
                }
            }
        }
        System.out.println("distancias mas cortas iniciando desde "+inical);
        for (int i = 0; i <=V; i++) {
            System.out.printf("Vertice %d, distancia mas corta = %d\n",i,distancia[i]);
        }
        System.out.println("Impresion del camino mas corto");
        int destino;
        destino=sc.nextInt();
        print(destino);
        System.out.println("");

    }

    public static void main(String[] args) {
        int E,origen,destino, peso, incial;
        V=sc.nextInt();
        E=sc.nextInt();
        for (int i = 0; i <=V; i++) {
            ady.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            origen=sc.nextInt();
            destino=sc.nextInt();
            peso=sc.nextInt();
            ady.get(origen).add(new Camino(destino, peso));// dirigido
            //ady.get(destino).add(new Camino(origen, peso));// no dirigido
        }
        System.out.println("Inserte el vertice inicial:");
        incial=sc.nextInt();
        dijkstra(incial);
    }
}

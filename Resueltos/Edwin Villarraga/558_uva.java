import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final int MAX = 2002;
    static final int INF = 1 << 30;
    static int[] previo = new int[MAX];
    static int[] distancia = new int[MAX];
    static int vertices;
    static List<List<Camino>> adyacencia = new ArrayList<List<Camino>>();
    static Scanner sc = new Scanner(System.in);

    static void init() {
        for (int i = 0; i <= vertices; i++) {
            distancia[i] = INF;
            previo[i] = -1;

        }
    }

    static class Camino {
        int destino, peso;
        public Camino(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
    static boolean relajalacion(int actual, int adyacente, int peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            return true;
        }
        return false;
    }

    static void bellmandFord(int inicial) {
        init();
        distancia[inicial] = 0;
        for (int i = 0; i <= vertices; i++) {
            for (int actual = 0; actual < vertices; actual++) {
                for (int j = 0; j < adyacencia.get(actual).size(); j++) {
                    int adyacente = adyacencia.get(actual).get(j).destino;
                    int peso = adyacencia.get(actual).get(j).peso;
                    relajalacion(actual, adyacente, peso);
                }
            }
        }
        for (int actual = 0; actual < vertices; actual++) {
            for (int j = 0; j < adyacencia.get(actual).size(); j++) {
                int adyacente = adyacencia.get(actual).get(j).destino;
                int peso = adyacencia.get(actual).get(j).peso;
                if (relajalacion(actual, adyacente, peso)) {
                	System.out.println("possible");
                    return;
                }
            }
        }
        System.out.println("not possible");
    }

    public static void main(String[] args) {
    	int t=sc.nextInt();
    	for(int e=0;e<t;e++) {
        int E, origen, destino, peso, inicial = 0;
        vertices = sc.nextInt();
        E = sc.nextInt();
        for (int i = 0; i < vertices; i++) {
            adyacencia.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            origen = sc.nextInt();
            inicial=origen;
            destino = sc.nextInt();
            peso = sc.nextInt();
            adyacencia.get(origen).add(new Camino(destino, peso)); // dirigido
            //adyacencia.get(destino).add(new Camino(origen, peso)); // no dirigido
        }
        bellmandFord(inicial);
        adyacencia.clear();
    	}
    }
}

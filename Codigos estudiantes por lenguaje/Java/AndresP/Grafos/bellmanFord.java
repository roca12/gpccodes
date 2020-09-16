

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bellMan {

    static final int MAX = 105;
    static int INF = 1 << 30;
    static int[] previo = new int[MAX];
    static int[] distancia = new int[MAX];
    static int vertices;
    static List<List<Camino>> adyacencia = new ArrayList<List<Camino>>();
    static Scanner sc = new Scanner(System.in);

    static void init() {
        new ArrayList<List<Camino>>();
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

    static void printpath(int destino) {
        if (previo[destino] != -1) {
            printpath(previo[destino]);

        }
        System.out.printf("%d ", destino);
    }

    static boolean relajacion(int actual, int adyacente, int peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            return true;

        }
        return false;
    }
    static void bellmanFord(int inicial){
        init();
        distancia[inicial]=0;
        for (int i = 0; i <=vertices; i++) {
            for (int actual = 0; actual <=vertices; actual++) {
                for (int j = 0; j< adyacencia.get(actual).size(); j++) {
                    int adyacente=adyacencia.get(actual).get(j).destino;
                    int peso=adyacencia.get(actual).get(j).peso;
                    relajacion(actual, adyacente, peso);
                }
            }
        }
         for (int actual = 0; actual <=vertices; actual++) {
                for (int j = 0; j< adyacencia.get(actual).size(); j++) {
                    int adyacente=adyacencia.get(actual).get(j).destino;
                    int peso=adyacencia.get(actual).get(j).peso;
                    if (relajacion(actual, adyacente, peso)) {
                        System.out.println("Existe ciclo negativo");
                        return;
                    }
                }
            }
         System.out.println("no existe ciclo negativo");
         System.out.println("Distancias mas cirtas desde el nodo"+inicial);
         for (int i = 0; i <=vertices; i++) {
             System.out.printf("nodo %d,distancia mas corta = %d\n",i,distancia[i]);
            
        }
         System.out.println("Camino mas corto hasta un destino");
         int destino =sc.nextInt();
         printpath(destino);
         System.out.println("");
}
    
}

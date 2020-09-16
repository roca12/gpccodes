
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BellmandFord_SP {

    static Scanner sc = new Scanner(System.in);
    static final int MAX = 105;
    static int INF = 1 << 30;
    static int[] previo = new int[MAX];
    static int[] distancia = new int[MAX];
    static int vertices;
    static List<List<Camino>> adyacencia = new ArrayList<List<Camino>>();
    
    //inicializacion de variables de acuerdo al numero de vertices
    static void init() {
        for (int i = 0; i <= vertices; i++) {
            distancia[i] = INF;
            previo[i] = -1;
        }
    }
    //estructura camino
    static class Camino {

        int destino;
        int peso;

        public Camino(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
    
    //impresion de caminos
    static void printPath(int destino) {
        if (previo[destino] != -1) {
            printPath(previo[destino]);
        }
        System.out.printf("%d ", destino);
    }
    
    //verificacion de los caminos mas cortos haciendo uso de funcion de relajacion
    static boolean relajacion(int actual, int adyacente, int peso) {
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
        //verificacion de todos los caminos
        for (int i = 0; i < vertices; i++) {
            for (int actual = 0; actual < vertices; actual++) {
                for (int j = 0; j < adyacencia.get(actual).size(); j++) {
                    int adyacente = adyacencia.get(actual).get(j).destino;
                    int peso = adyacencia.get(actual).get(j).peso;
                    relajacion(actual, adyacente, peso);
                }
            }
        }
        //verificacion de ciclo negativo
        for (int actual = 0; actual < vertices; actual++) {
            for (int j = 0; j < adyacencia.get(actual).size(); j++) {
                int adyacente = adyacencia.get(actual).get(j).destino;
                int peso = adyacencia.get(actual).get(j).peso;
                if (relajacion(actual, adyacente, peso)) {
                    System.out.println("Existe ciclo negativo");
                    return;
                }
            }
        }
        System.out.println("No existe ciclo negativo");
        System.out.println("Distancias más cortas desde el nodo " + inicial);
        for (int i = 0; i <= vertices; i++) {
            System.out.printf("nodo %d, distancia mas corta = %d\n", i, distancia[i]);
        }
        System.out.println("Camino más corto hasta un destino:");
        int destino = sc.nextInt();
        printPath(destino);
        System.out.println("");
    }

    public static void main(String[] args) {
        int E, origen, destino, peso, inicial;
        vertices = sc.nextInt();
        E = sc.nextInt();
        for(int i = 0; i <= vertices; i++){
            adyacencia.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            origen = sc.nextInt();
            destino = sc.nextInt();
            peso = sc.nextInt();
            adyacencia.get(origen).add(new Camino(destino, peso)); //dirigido
            adyacencia.get(destino).add(new Camino(origen, peso)); // no dirigido
        }
        System.out.println("Nodo incial:");
        inicial = sc.nextInt();
        bellmandFord(inicial);
    }
}
//Si los nodos comienzan desde 1, colocar los iguales el los dos
//primero triple for's y el primero del verificacion de ciclo negativo


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Código java que realiza el triángulo de Pascal
public class Main {

    static final int MAX = 1005;
    static int padre[] = new int[MAX];

    static void makeSet(int n) {
        for (int i = 0; i <=n; i++) {
            padre[i] = i;
        }
    }

    static int find(int x) {
        return (x == padre[x] ? x : (padre[x] = find(padre[x])));
    }

    static void union(int x, int y) {
        padre[find(x)] = find(y);
    }

    static boolean sameComponent(int x, int y) {
        if (find(x) == find(y)) {
            return true;
        }
        return false;
    }

    static int V, E;

    static class Edge implements Comparator<Edge> {

        int origen, destino, peso;

        public Edge() {
        }

        @Override
        public int compare(Edge t, Edge t1) {
            return t.peso - t1.peso;
        }
    }
    static Edge[] aristas = new Edge[MAX];
    static Edge MST[] = new Edge[MAX];

    static void KruskalMST() {
        int origen, destino, peso;
        int total = 0;
        int numAristas = 0;
        makeSet(V);
        Arrays.sort(aristas, 0, E, new Edge());
        for (int i = 0; i < E; i++) {
            origen = aristas[i].origen;
            destino = aristas[i].destino;
            peso = aristas[i].peso;
            if (!sameComponent(origen, destino)) {
                total += peso;
                MST[numAristas++] = aristas[i];
                union(origen, destino);

            }
        }
        if (V - 1 != numAristas) {
            System.out.println("No existe MST valido para el grafo ingresado, este debe ser conexo");
            return;
        }
        System.out.println("El Mst Encontrado contiene las siguientes aristas");
        for (int i = 0; i < numAristas; i++) {
            System.out.printf("(%d,%d):%d\n", MST[i].origen, MST[i].destino, MST[i].peso);
        }
        System.out.println("El costo minimo de todas las aristas del MST es " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V=sc.nextInt();
        E=sc.nextInt();
        for (int i = 0; i < E; i++) {
            aristas[i]= new Edge();
            aristas[i].origen=sc.nextInt();
            aristas[i].destino=sc.nextInt();
            aristas[i].peso=sc.nextInt();
        }
        KruskalMST();
    }
}

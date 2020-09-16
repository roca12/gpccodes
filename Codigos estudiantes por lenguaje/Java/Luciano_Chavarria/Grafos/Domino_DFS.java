import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final int MAX = 10001;
    static ArrayList<ArrayList<Integer>> ady = new ArrayList<ArrayList<Integer>>();
    static Scanner sc = new Scanner(System.in);
    static int total;
    static boolean visitado[] = new boolean[MAX];

    static void DFS(int u) {
        total++;
        visitado[u] = true;
        for (int v = 0; v < ady.get(u).size(); v++) {
            if (!visitado[ady.get(u).get(v)]) {
                DFS(ady.get(u).get(v));
            }
        }
    }

    public static void main(String[] args) {
        int dominos, caminos, busquedas, desde, hasta, origen;
        dominos = sc.nextInt();
        caminos = sc.nextInt();
        busquedas = sc.nextInt();
        for (int i = 0; i < dominos; i++) {
            ady.add(new ArrayList<>());
        }
        while (caminos > 0) {
            desde = sc.nextInt();
            hasta = sc.nextInt();
            ady.get(desde).add(hasta);
            caminos--;
        }
        while (busquedas > 0) {
            origen = sc.nextInt();
            total = 0;
            Arrays.fill(visitado, false);
            DFS(origen);
            System.out.println("Total dominos tumbados: " + total);
            busquedas--;
        }
    }
}

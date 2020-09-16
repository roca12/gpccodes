import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Domino_DFS {

    public static void main(String[] args) {
        int dominos, caminos, consultas, desde, hasta, origen;
        dominos = sc.nextInt();
        caminos = sc.nextInt();
        consultas = sc.nextInt();
        for (int i = 0; i < dominos; i++) {
            ady.add(new ArrayList<>());
        }
        while (caminos > 0) {
            desde = sc.nextInt();
            hasta = sc.nextInt();
            ady.get(desde).add(hasta);
            caminos--;
        }
        while (consultas > 0) {
            origen = sc.nextInt();
            total = 0;
            Arrays.fill(visitados, false);
            DFS(origen);
            System.out.println("Total dominos tumbados: " + total);
            consultas--;
        }
    }

    static final int MAX = 10001;
    static ArrayList<ArrayList<Integer>> ady = new ArrayList<ArrayList<Integer>>();
    static Scanner sc = new Scanner(System.in);
    static int total;
    static boolean visitados[] = new boolean[MAX];

    static void DFS(int u) {
        total++;
        visitados[u] = true;
        for (int v = 0; v < ady.get(u).size(); v++) {
            if (!visitados[ady.get(u).get(v)]) {
                DFS(ady.get(u).get(v));
            }
        }
    }
}

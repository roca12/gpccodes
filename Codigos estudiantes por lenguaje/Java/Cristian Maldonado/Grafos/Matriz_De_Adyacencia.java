import java.util.Arrays;
import java.util.Scanner;

public class Matriz_De_Adyacencia {

    static int G[][];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int Vertices, Caminos;
        Vertices = sc.nextInt();
        Caminos = sc.nextInt();
        G = new int[Vertices][Vertices];
        for (int i = 0; i < Vertices; i++) {
            Arrays.fill(G[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < Vertices; i++) {
            G[i][i] = 0;
        }
        for (int i = 0; i < Caminos; i++) {
            int desde, hasta, peso;
            desde = sc.nextInt();
            hasta = sc.nextInt();
            peso = sc.nextInt();
            // Grafo dirigido
            G[desde][hasta] = peso;
            // Complementar con la siguiente linea para no dirigido
            G[hasta][desde] = peso;
        }
        for (int i = 0; i < Vertices; i++) {
            for (int j = 0; j < Vertices; j++) {
                if (G[i][j] == Integer.MAX_VALUE) {
                    System.out.print("inf" + "\t");
                } else {
                    System.out.print(G[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

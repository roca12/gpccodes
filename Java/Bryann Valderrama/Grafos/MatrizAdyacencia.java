import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int G[][];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        G = new int[V][V];
        for (int i = 0; i < V; i++) {
            Arrays.fill(G[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < V; i++) {
            G[i][i] = 0;
        }
        for (int i = 0; i < E; i++) {
            int desde, hasta, peso;
            desde = sc.nextInt();
            hasta = sc.nextInt();
            peso = sc.nextInt();
            //Dirigido
            G[desde][hasta] = peso;
            //No Dirigido
            G[hasta][desde] = peso;
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (G[i][j] == Integer.MAX_VALUE) {
                    System.out.print("inf" + "\t");
                } else {
                    System.out.print(G[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}

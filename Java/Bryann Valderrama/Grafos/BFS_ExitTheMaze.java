
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static final int MAX = 100;
    static Scanner sc = new Scanner(System.in);
    static char[][] ady = new char[MAX][MAX];
    static boolean visitado[][] = new boolean[MAX][MAX];
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int h, w;
    static Estado prev[][] = new Estado[MAX][MAX];

    static class Estado {

        int x;
        int y;
        int d;

        public Estado(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        public Estado() {
        }

    }

    static int BFS(int x, int y, int h, int w) {
        Estado incial = new Estado(x, y, 0);
        Queue<Estado> Q = new LinkedList<>();
        Q.offer(incial);
        for (int i = 0; i < MAX; i++) {
            Arrays.fill(visitado[i], false);
        }
        prev[x][y] = new Estado(-1, -1, -1);
        while (!Q.isEmpty()) {
            Estado actual = Q.poll();
            if (ady[actual.x][actual.y] == 'S') {
                print(actual.x, actual.y);
                return actual.d;
            }
            visitado[actual.x][actual.y] = true;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + actual.x;
                int ny = dy[i] + actual.y;
                if (nx >= 0 && nx < h && ny >= 0
                        && ny < w && ady[nx][ny] != '#' && !visitado[nx][ny]) {
                    Estado adyacente = new Estado(nx, ny, actual.d + 1);
                    Q.offer(adyacente);
                    prev[nx][ny] = actual;
                }
            }
        }
        return -1;
    }

    static void print(int x, int y) {
        System.out.println("imprimiendo camino con asteriscos");
        for (int i = x, j = y; prev[i][j].d != -1; i = prev[x][y].x, j = prev[x][y].y) {
            ady[i][j] = '*';
            x = i;
            y = j;
        }
        System.out.println("Camino con el menor numero de pasos");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%c", ady[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int x = 0, y = 0;
        //System.out.println("Altura del laberinto");
        h = sc.nextInt();
        //System.out.println("Anchura del laberinto");
        w = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            String aux = sc.nextLine();
            for (int j = 0; j < w; j++) {
                ady[i][j] = aux.charAt(j);
                if (ady[i][j] == 'I') {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Vista previa");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%c", ady[i][j]);
            }
            System.out.println("");
        }
        int min = BFS(x, y, h, w);
        if (min != -1) {
            System.out.println("Menor numero de pasos: " + min);
        } else {
            System.out.println("No se pudo llegar a ese destino");
        }
    }
}

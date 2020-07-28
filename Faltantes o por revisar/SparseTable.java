
import java.util.Random;

//Estructura de datos que permite procesar consultas por rangos.
public class SparseTable {

    static int MAX_N = 1000;
    static int K = (int) (Math.log(MAX_N) / Math.log(2)) + 1;
    static int st[][] = new int[MAX_N][K];
    static int _log2[] = new int[MAX_N + 1];
    static int A[] = new int[MAX_N];
    static int n;

    static void calc_log2() {
        _log2[1] = 0;
        for (int i = 2; i <= MAX_N; i++) {
            _log2[i] = _log2[i / 2] + 1;
        }
    }

    static void build() {
        for (int i = 0; i < n; i++) {
            st[i][0] = A[i];
        }
        for (int j = 1; j <= K; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                st[i][j] = Math.min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
            }
        }
    }

    static int rmq(int i, int j) {
        int k = _log2[j - i + 1];
        return Math.min(st[i][k], st[j - (1 << k) + 1][k]);
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            A[i] = r.nextInt(50);
            System.out.print(A[i] + " ");
        }
        n = A.length;
        System.out.println("");
        build();
        calc_log2();
        System.out.println(rmq(0, 2));

    }
}

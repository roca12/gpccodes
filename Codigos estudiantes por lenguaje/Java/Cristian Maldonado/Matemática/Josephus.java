
import java.util.Scanner;

public class Josephus {

    static int next(int a, int k, int d[]) {
        int j = a - 1;//posicion anterior de "a"
        for (int i = 0; i < k;) {
            j = (j + 1) % d.length;
            if (d[j] != -1) {
                i++;
            }
        }
        System.out.println("next: " + j);
        return j;
    }

    static int josephus(int n, int k) {
        int d[] = new int[n + 1];
        d[0] = -1; //Cuando comienza desde 1
        for (int i = 1; i <= n; i++) {
            d[i] = i;
        }
        int indice = n;
        int a = 0;//calculo de la posición siguiente a saltar
        while (indice != 1) {
            indice--;
            a = next(a, k, d);
            d[a] = -1;
            a++;
        }
        for (indice = 0; d[indice] == -1; indice++);
        return d[indice];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(josephus(sc.nextInt(), sc.nextInt()));
        }
    }
}

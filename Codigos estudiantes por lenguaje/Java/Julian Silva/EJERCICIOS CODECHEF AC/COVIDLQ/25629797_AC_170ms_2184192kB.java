
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int x = sc.nextInt();
            int a[] = new int[x];
            int j, k, cont = 0;
            for (j = 0; j < x; j++) {
                a[j] = sc.nextInt();
            }
            for (j = 0; j < x; j++) {
                if (a[j] == 1) {
                    for (k = j + 1; k < j + 6 && k < x; k++) {
                        if (a[k] == 1) {
                            cont = 1;
                        }
                    }
                }
            }
            if (cont == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}

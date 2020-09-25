
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 1; i <= c; i++) {
            int x = 0, y = 0, h, a, aux = 0;
            h = sc.nextInt();
            for (int j = 0; j < h; j++) {
                a = sc.nextInt();
                if (j == 0) {
                    aux = a;
                } else {
                    if (a > aux) {
                        y++;
                        aux = a;
                    } else if (a < aux) {
                        x++;
                        aux = a;
                    }
                }
            }
            System.out.println("Case " + i + ": " + y + " " + x);
        }

    }

}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            int x = d * (a + b);
            for (int j = 0; j < a; j++) {
                x = x - sc.nextInt();
            }
            if (x > 0 && x % b == 0) {
                System.out.println(x / b);
            } else {
                System.out.println(-1);
            }
        }
    }
}

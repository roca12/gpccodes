import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        long x, y;
        c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            x = sc.nextLong() - 1;
            y = x % 26;
            x = (long) Math.pow(2, x / 26);

            if (y >= 10) {
                System.out.println("0 0 " + x);
            } else if (y >= 2) {
                System.out.println("0 " + x + " 0");
            } else {
                System.out.println(x + " 0 0");
            }
        }

    }
}
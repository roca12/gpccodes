
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a < 20) {
            for (int i = 1; i <= a; i++) {
                long x = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                if ((x < 1) || (b < 1) || (c < 1) || (x >= b + c) || (c >= b + x) || (b >= x + c)) {
                    System.out.println("Case " + i + ":" + " Invalid");
                } else if (x == b && c == x) {
                    System.out.println("Case " + i + ":" + " Equilateral");

                } else if ((x == b) || (b == c) || (c == x)) {
                    System.out.println("Case " + i + ":" + " Isosceles");

                } else {
                    System.out.println("Case " + i + ":" + " Scalene");
                }

            }
        }

    }
}

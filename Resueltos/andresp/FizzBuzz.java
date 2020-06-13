import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, n, casos;

        casos = sc.nextInt();
        for (int is = 0; is < casos; is++) {

            x = sc.nextInt();
            y = sc.nextInt();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % x == 0 && i % y == 0) {
                    System.out.println("FizzBuzz");

                } else if (i % x == 0) {
                    System.out.println("Fizz");
                } else if (i % y == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

            }

        }
    }

}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x >= 1 && x <= 10000) && (y >= 1 && y <= 10000) && (z >= 0 && z < x)) {
                int r = x + y;
                double result = ((y * (r-  1)) / (double) (r * (r - z - 1)));
                System.out.printf("%.5f\n", result);
            }
        }
    }
}

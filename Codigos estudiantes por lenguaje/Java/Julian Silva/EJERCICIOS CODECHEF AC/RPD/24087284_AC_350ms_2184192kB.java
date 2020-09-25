
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            int a = sc.nextInt();
            int b[] = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = sc.nextInt();
            }
            int z = Integer.MIN_VALUE;
            int x = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    x = (b[i] * b[j]);
                    int sum = 0;
                    while (x != 0) {
                        int res = x % 10;
                        sum = sum + res;
                        x = x / 10;
                    }
                    if (sum > z) {
                        z = sum;
                    }
                }
            }
            System.out.println(z);
        }
    }
}

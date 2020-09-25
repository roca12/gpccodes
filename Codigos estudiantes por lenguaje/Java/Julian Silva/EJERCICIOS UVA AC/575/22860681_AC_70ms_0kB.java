
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.nextLine();
            if (a.equals("0")) {
                break;
            }
            long c = 0;
            int b = 1;

            for (int i = a.length() - 1; i >= 0; i--) {
                int p = 2;
                for (int j = 1; j < b; ++j) {
                    p *= 2;
                }
                p -= 1;

                c += p * (a.charAt(i) - '0');
                ++b;

            }
            System.out.println(c);

        }
    }
}

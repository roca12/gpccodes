import java.util.*;

public class Main {

    static int russianPeasant(int a, int b) {
        int res = 0;
        while (b > 0) {
            if ((b & 1) != 0) {
                res += a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(russianPeasant(a, b));
    }
}

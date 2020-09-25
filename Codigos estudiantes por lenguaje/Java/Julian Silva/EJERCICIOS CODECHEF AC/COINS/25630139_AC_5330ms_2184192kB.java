import java.util.*;

public class Main {

    static long money(long x) {
        if (x >= 12) {
            return money(x / 2) + money(x / 3) + money(x / 4);
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long x = sc.nextLong();
            System.out.println(money(x));
        }
    }
}
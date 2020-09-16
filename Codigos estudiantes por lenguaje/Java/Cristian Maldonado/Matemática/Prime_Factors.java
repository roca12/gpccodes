
public class Prime_Factors {

    static void primeFactor(int n) {
        for (long p = 2; p * p <= n; p++) {
            while (n % p == 0) {
                System.out.println(p);
                n /= p;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        primeFactor(20);
    }
}

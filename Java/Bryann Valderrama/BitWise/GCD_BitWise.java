public class Main {

    static int gcd(int a, int b) {
        if (b == 0 || a == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        }
        if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        }
        if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        }
        return (a > b) ? gcd(a - b, b) : gcd(a, b - a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(50, 30));
    }
}

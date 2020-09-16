public class NSquareNoPow {

    static int square(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            n = -n;
        }
        int x = n >> 1;
        if ((n & 1) > 0) {
            return ((square(x) << 2) + (x << 2) + 1);
        } else {
            return (square(x) << 2);
        }
    }

    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            int a = i & 1;
            if (a > 0) {
                System.out.println("impar");
            } else {
                System.out.println("par");
            }
            System.out.println(i + " -> " + square(i));
            System.out.println("");
        }
    }
}

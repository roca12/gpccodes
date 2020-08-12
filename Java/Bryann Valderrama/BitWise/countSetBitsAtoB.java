public class Main {

    static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    static int flippedCount(int a, int b) {
        return countSetBits(a ^ b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 100;
        System.out.println(a + "-> " + Integer.toString(a, 2));
        System.out.println(b + "-> " + Integer.toString(b, 2));
        System.out.println(flippedCount(a, b));
    }
}

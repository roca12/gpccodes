import java.util.*;

public class Main {

    static int swapBits(int x) {
        int even_bits = x & 0xAAAAAAAA;
        int odd_bits = x & 0x55555555;
        even_bits >>= 1;
        odd_bits <<= 1;
        return (even_bits | odd_bits);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(swapBits(x));
    }
}

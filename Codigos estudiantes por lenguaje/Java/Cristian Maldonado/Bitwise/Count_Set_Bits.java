import java.util.Scanner;

public class Count_Set_Bits {

    static int countSetBitsUtil(int x) {
        if (x <= 0) {
            return 0;
        }
        return ((x & 1) == 0 ? 0 : 1) + countSetBitsUtil(x >> 1);
    }

    static int countSetBits(int n) {
        int bitCount = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " -> "+Integer.toString(i,2));
            bitCount += countSetBitsUtil(i);
        }
        return bitCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Conteo total del set de bits es: "+countSetBits(n));
    }
}

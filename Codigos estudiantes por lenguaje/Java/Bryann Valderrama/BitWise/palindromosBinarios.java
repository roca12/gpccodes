import java.util.Scanner;

public class Main {

    static int INT_MAX = Integer.MAX_VALUE;

    static int isKthBitSet(int x, int k) {
        return ((x & (1 << (k - 1))) > 0) ? 1 : 0;
    }

    static int leftmostSetBit(int x) {
        int cont = 0;
        while (x > 0) {
            cont++;
            x = x >> 1;
        }
        return cont;
    }

    static int isBinPal(int x) {
        int l = leftmostSetBit(x);
        int r = 1;
        while (l > r) {
            if (isKthBitSet(x, 1) != isKthBitSet(x, r)) {
                return 0;
            }
            l--;
            r++;
        }
        return 1;
    }

    static int findNthPal(int n) {
        int pal_cont = 0;
        int i;
        for (i = 0; i < INT_MAX; i++) {
            if (isBinPal(i) > 0) {
                pal_cont++;
            }
            if (pal_cont == n) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str, 16);
        int res = findNthPal(n);
        System.out.println(res + "-> " + Integer.toString(res, 2));
    }
}

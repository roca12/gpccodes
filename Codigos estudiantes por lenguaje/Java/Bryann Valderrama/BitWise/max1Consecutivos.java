import java.util.*;

public class Main {

    static int flipBit(int a) {
        if (~a == 0) {
            return 8 * sizeof();
        }
        int currelen = 0, prevlen = 0, maxlen = 0;
        while (a != 0) {
            if ((a & 1) == 1) {
                currelen++;
            } else if ((a & 1) == 0) {
                prevlen = ((a & 2) == 0) ? 0 : currelen;
                currelen = 0;
            }
            maxlen = Math.max(prevlen + currelen, maxlen);
            a >>= 1;
        }
        return maxlen + 1;
    }

    static byte sizeof() {//devuelve el tamaño del entero 
        byte sizeOfInteger = 0;
        return sizeOfInteger;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a + "-> " + Integer.toString(a, 2));
        System.out.println(flipBit(a));
    }
}

public class Main {

    static int getNext(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;
        while (((c & 1) == 0) && c != 0) {
            c0++;
            c >>= 1;
        }
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }
        int p = c0 + c1;
        n |= (1 << p);
        n &= ~((1 << p) - 1);
        n |= (1 << (c1 - 1)) - 1;
        return n;
    }

    static int getPrev(int n) {
        int temp = n;
        int c0 = 0;
        int c1 = 0;
        while ((temp & 1) == 1) {
            c1++;
            temp = temp >> 1;
        }
        if (temp == 0) {
            return -1;
        }
        while (((temp & 1) == 0)
                && (temp != 0)) {
            c0++;
            temp = temp >> 1;
        }
        // posicion de el cero no final de 
        // mas a la derecha
        int p = c0 + c1;
        //limpia del bit c hacia adelante 
        n = n & ((~0) << (p + 1));
        // Secuencia de (c1+1) unos
        int mask = (1 << (c1 + 1)) - 1;
        n = n | mask << (c0 - 1);
        return n;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + " -> " + Integer.toString(n, 2));
        System.out.println(getNext(n) + " -> " + Integer.toString(getNext(n), 2));
        System.out.println(getPrev(n) + " -> " + Integer.toString(getPrev(n), 2));
    }
}

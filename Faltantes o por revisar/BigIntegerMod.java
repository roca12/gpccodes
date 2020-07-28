//Calcula n % m. Utilizar cuando n es un número muy muy grande.

public class BigIntegerMod {

    static int mod(String n, int m) {
        int r = 0;
        for (int i = 0; i < n.length(); i++) {
            r = (r * 10 + (n.charAt(i) - '0')) % m;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(mod("9564784542", 10));
    }
}

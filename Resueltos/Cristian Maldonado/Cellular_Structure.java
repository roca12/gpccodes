import java.util.Scanner;

public class Cellular_Structure {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            char opcion1 = 'A';
            char opcion2 = 'B';
            String cadena = sc.next();
            int tam = cadena.length();
            if (!(tam % 2 == 1)) {
                System.out.println("MUTANT");
            } else if (tam == 1) {
                System.out.println(cadena.charAt(0) == opcion1 ? "SIMPLE" : "MUTANT");
            } else if (cadena.charAt(tam-1) == opcion2 && cadena.charAt(tam-2) == opcion1) {
                System.out.println("FULLY-GROWN");
            } else if (cadena.charAt(0) == opcion2 && cadena.charAt(tam-1) == opcion1) {
                System.out.println("MUTAGENIC");
            }else{
                System.out.println("MUTANT");
            }
        }
    }
}

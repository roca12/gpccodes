
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int tam = sc.nextInt();
            int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
            String entrada1 = sc.next();
            String entrada2 = sc.next();
            String vector1[] = entrada1.split("");
            String vector2[] = entrada2.split("");
            for (int j = 0; j < tam; j++) {
                if (vector1[j].equals("1")) {
                    contador1++;
                } else {
                    contador2++;
                }
                if (vector2[j].equals("1")) {
                    contador3++;
                } else {
                    contador4++;
                }
            }
            if (contador1 == contador3 && contador2 == contador4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}

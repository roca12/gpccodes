import java.util.Scanner;

public class Tariff_Plan {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int acumulador1 = 0;
            int acumulador2 = 0;
            int llamadas = sc.nextInt();
            for (int j = 0; j < llamadas; j++) {
                int call = sc.nextInt();
                acumulador1 += Mile(call);
                acumulador2 += Juice(call);
            }
            if (acumulador1 < acumulador2) {
                System.out.println("Case "+i+": Mile "+acumulador1);
            } else if (acumulador1 == acumulador2) {
                System.out.println("Case "+i+": Mile Juice "+acumulador1);
            } else {
                System.out.println("Case "+i+": Juice "+acumulador2);
            }
        }
    }

    static int Mile(int call) {
        int precio = 10;
        int ayuda = call / 30;
        if (ayuda < 1) {
            call = precio;
        } else if (ayuda > 0) {
            call = precio * (ayuda + 1);
        }
        return call;
    }

    static int Juice(int call) {
        int precio = 15;
        int ayuda = call / 60;
        if (ayuda < 1) {
            call = precio;
        } else if (ayuda > 0) {
            call = precio * (ayuda + 1);
        }
        return call;
    }

}

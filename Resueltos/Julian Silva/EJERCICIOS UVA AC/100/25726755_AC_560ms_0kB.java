import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, a, aux = 0, aux2 = 0;
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) {
                m1 = x;
                m2 = y;
            } else {
                m1 = y;
                m2 = x;
            }
            aux2 = 0;
            for (a = m2; m2 <= m1; m2++) {
                a = m2;
                for (aux = 1; a != 1; aux++) {
                    if (a % 2 == 1) {
                        a = 3 * a + 1;
                    } else {
                        a = a / 2;
                    }
                }
                if (aux > aux2) {
                    aux2 = aux;
                }
            }
            System.out.println(x + " " + y + " " + aux2);
        }
    }
}

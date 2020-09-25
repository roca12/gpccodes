
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int in = sc.nextInt();
            int brok[] = new int[in];
            for (int j = 0; j < brok.length; j++) {
                String c = sc.next();
                if (c.equals("LEFT")) {
                    brok[j] = -1;
                } else if (c.equals("RIGHT")) {
                    brok[j] = 1;
                } else {
                    String z = sc.next();
                    int num = sc.nextInt();
                    brok[j] = brok[num - 1];
                }
            }
            for (int j = 0; j < brok.length; j++) {
                s += brok[j];
            }
            System.out.println(s);
            s=0;
        }

    }
}


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int x = sc.nextInt();
            int aux = 0;
            for (int j = 0; j < x; j++) {
                aux += sc.nextInt();
                aux -= sc.nextInt();
            }
            System.out.println(aux);
        }
    }

}

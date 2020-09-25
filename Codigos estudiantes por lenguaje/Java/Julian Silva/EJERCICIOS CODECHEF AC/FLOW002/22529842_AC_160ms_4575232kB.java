
import java.util.*;

class Main {

    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int rem = a % b;
                System.out.println(rem);
                t--;
            }
        } catch (Exception e) {
            return;
        }
    }
}

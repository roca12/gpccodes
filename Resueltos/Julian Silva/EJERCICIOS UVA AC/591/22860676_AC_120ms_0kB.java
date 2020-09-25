import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] vec = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                vec[i] = sc.nextInt();
                total += vec[i];
            }
            int prom = total / n;
            int restante = 0;
            for (int i = 0; i < n; i++) {
                if (vec[i] > prom) {
                    restante += vec[i] - prom;
                }
            }
            System.out.println("Set #" + x++);
            System.out.println("The minimum number of moves is " + restante + ".\n");
        }
    }
    
}
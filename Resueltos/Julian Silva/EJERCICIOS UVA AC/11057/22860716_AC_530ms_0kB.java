
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter sc2 = new PrintWriter(System.out);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] count = new int[1000005];
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                count[arr[i]]++;
            }
            int M = sc.nextInt();
            int dif = 1000005, x = 0, y = 0;
            for (int i = 0; i < N; i++) {
                try {
                    int s = M - arr[i];
                    if (s > 0 && ((s == arr[i] && count[arr[i]] > 1) || (s != arr[i] && count[s] > 0)) && Math.abs(s - arr[i]) < dif) {
                        dif = Math.abs(s - arr[i]);
                        x = arr[i];
                        y = s;
                    }
                } catch (Exception e) {
                }
            }
            if (x > y) {
                x ^= y;
                y ^= x;
                x ^= y;
            }
            sc2.println("Peter should buy books whose prices are " + x + " and " + y + ".\n");
            sc2.flush();
        }
        sc2.close();
    }
}

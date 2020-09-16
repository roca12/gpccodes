import java.util.*;

public class Main {

    static int nhtMagicNo(int n) {
        int pow = 1;
        int answer = 0;
        while (n != 0) {
            pow = pow * 5;
            if ((n & 1) == 1) {
                answer += pow;
            }
            n >>= 1;
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " -> " + Integer.toString(n, 2) + " -> " + nhtMagicNo(n));
    }
}

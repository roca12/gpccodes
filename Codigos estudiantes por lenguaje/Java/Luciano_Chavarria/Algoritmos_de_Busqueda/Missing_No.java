
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        int missed = getMissingNo(arr, arr.length);
        System.out.println("el numero que falta es: "+ missed);
    }

    static int getMissingNo(int a[], int n) {
        int x1 = a[0];
        int x2 = 1;
        for (int i = 1; i < n; i++) {
            x1 ^= a[i];
        }
        for (int i = 2; i <= n + 1; i++) {
            x2 ^= i;
        }
        return x1 ^ x2;
    }

}

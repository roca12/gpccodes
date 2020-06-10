
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, arr.length);
    }

    static void minAbsSumPair(int[] arr, int n) {
        int l, r, min_sum, sum = 0, min_l, min_r;
        if (n < 2) {
            System.out.println("Array no tiene suficientes valores");
            return;
        }
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for (l = 0; l < n - 1; l++) {
            for (r = l + 1; r < n; r++) {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
        }
        System.out.println("La suma minima es: " + arr[min_l] + " y " + arr[min_r]);
    }

}

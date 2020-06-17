//No ordena numeros negativos

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr[i] = Integer.parseInt(entrada[i]);
        }
        radixSort(arr, arr.length);
        print(arr, arr.length);
    }

    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (int j = 0; j < n; j++) {
            count[(arr[j] / exp) % 10]++;
        }
        for (int j = 1; j < 10; j++) {
            count[j] = count[j] + count[j - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            output[count[(arr[j] / exp) % 10] - 1] = arr[j];
            count[(arr[j] / exp) % 10]--;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = output[j];
        }
    }

    static void radixSort(int arr[], int n) {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp = exp * 10) {
            countSort(arr, n, exp);
        }
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ShellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static int ShellSort(int arr[]) {
        int n = arr.length;
        for (int grap = n / 2; grap > 0; grap /= 2) {
            for (int i = grap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= grap && arr[j - grap] > temp; j -= grap) {
                    arr[j] = arr[j - grap];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }

}

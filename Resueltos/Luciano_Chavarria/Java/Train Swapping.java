import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int m = 0;
            int arr[] = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k] > arr[k + 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                        m++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes " + m + " swaps.");
        }
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class shellsort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada[] = br.readLine().split(" ");
        ArrayList<Integer> entrada2=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr2.add(entrada2.get(i));
            arr[i] = Integer.parseInt(entrada[i]);
        }
        ahellsort(arr);
        print(arr, arr.length);
    }

    static int ahellsort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    arr[j] = temp;

                }
            }

        }
        return 0;
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr + " ");
        }
        System.out.println("");
    }
}

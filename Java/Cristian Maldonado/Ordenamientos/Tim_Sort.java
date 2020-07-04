import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr[i] = Integer.parseInt(entrada[i]);
        }
        timSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int RUN = 32;

    static void insertionSort(int arr[], int left, int right) {
        int i;
        for (i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (arr[j] > temp && j >= left) {
                arr[j + 1] = arr[j];
                j--;
                if (j < 0) {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    static void merge(int arr[], int x, int m, int r) {
        int len1 = m - x + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int i = 0; i < len1; i++) {
            left[i] = arr[x + i];
        }
        for (int i = 0; i < len2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = x;
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < len2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    static void timSort(int arr[], int tam) {
        for (int i = 0; i < tam; i += RUN) {
            insertionSort(arr, i, Math.min((i + 31), (tam - 1)));
        }
        for (int size = RUN; size < tam; size = 2 * size) {
            for (int left = 0; left < tam; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (tam - 1));
                merge(arr, left, mid, right);
            }
        }
    }
}

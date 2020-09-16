import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Merge_Sort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr[i] = Integer.parseInt(entrada[i]);
        }
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    static void merge(int arr[], int left, int mid, int right) {
        int tam1 = mid - left + 1;
        int tam2 = right - mid;
        int Left[] = new int[tam1];
        int Right[] = new int[tam2];
        for (int i = 0; i < tam1; i++) {
            Left[i] = arr[left + i];
        }
        for (int i = 0; i < tam2; i++) {
            Right[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < tam1 && j < tam2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < tam1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < tam2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int m = (left + right) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }

    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

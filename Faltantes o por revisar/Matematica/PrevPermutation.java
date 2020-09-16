
import java.util.Arrays;

public class PrevPermutation {

    public static boolean prev_permutation(int[] arr) {
        int len = arr.length;
        int i = len - 1;
        // 1. find largest i where arr[i - 1] > arr[i]
        while (i > 0) {
            if (arr[i - 1] > arr[i]) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return false;
        }
        // 2. find largest j where arr[i - 1] > arr[j] and j >= i
        int j = len - 1;
        while (j >= i) {
            if (arr[i - 1] > arr[j]) {
                break;
            }
            j--;
        }
        // 3. swap elements between arr[i-1] and arr[j]
        swap(i - 1, j, arr);
        // 4. reverse elements from i to end of array
        len--;
        while (i < len) {
            swap(i, len, arr);
            len--;
            i++;
        }
        return true;
    }

    public static void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int data[] = {3, 2, 1};
        while (prev_permutation(data)) {
            System.out.println(Arrays.toString(data));
        }
    }
}

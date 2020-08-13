public class Main {

    static int getOddOcurrence(int arr[], int ar_size) {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        System.out.println(getOddOcurrence(arr, n));
    }
}

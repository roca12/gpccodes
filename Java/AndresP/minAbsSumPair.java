public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, arr.length);
    }
static void minAbsSumPair(int arr[], int n) {
        int l, r, min_sum, sum, min_1, min_r;
        if (n < 2) {
            System.out.println("no hay cant suficiente");
            return;
        }
        min_1 = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for (l = 0; l < n - 1; l++) {
            for (r = l + 1; r < n; r++) {
                sum = arr[l] + arr[r];
                if (Math.abs(min_sum) > Math.abs(sum)) {
                    min_sum = sum;
                    min_1 = l;
                    min_r = r;
                }

            }
        }
        System.out.println("los doc elemnetos los cuales tienen la suma minima son" + arr[min_1] + " y " + arr[min_r]);
    }

}

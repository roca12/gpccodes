
public class Main{
    
    static void minAbsSumPair(int arr[], int arr_size){
        int left, r, min_sum, sum, min_l, min_r;
        /*El array debe tener al menos 2 elementos*/
        if (arr_size < 2) {
            System.out.println("Invalid Input");
            return;
        }
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for (left = 0; left < arr_size - 1; left++) {
            for (r = left + 1; r < arr_size; r++) {
                sum = arr[left] + arr[r];
                if (Math.abs(min_sum) > Math.abs(sum)) {
                min_sum = sum;
                min_l = left;
                min_r = r;
                }
            }
        }
        System.out.println("Los dos elementos los cuales "+ "tienen la suma minima son "+ arr[min_l] + " y " + arr[min_r]+ " = " + min_sum);
    }
    
    public static void main(String[] args){
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, 6);
    }
}

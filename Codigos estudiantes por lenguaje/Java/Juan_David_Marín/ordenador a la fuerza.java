import java.util.Arrays;

public class Main
{
    static void bubbleSort(int arr[], int n){
        if ( n == 1){
            return;
        }
        for (int i= 0 ; i < n; i++) {
            for ( int j = 0; j < n - 1; j++){
                if(arr[j]>arr[j + 1]){
                    int aux = arr[j];
                    arr[j]= arr[j + 1];
                    arr[ j +1] = aux;
                }
            }
        }
    }
	public static void main(String[] args) {
	    int arr[]={64, 34, 25, 12, 22, 11, 90};
	    bubbleSort(arr, arr.length);
	    System.out.println(Arrays.toString(arr));
	}
}

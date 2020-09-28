import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int binarySearch(int arr[], int left, int right, int x) {
        if (arr.length==0)
            return -1;
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={500,2,3,4,10,40};
        Arrays.sort(arr);
        int n=arr.length;
        int x=100;
        int result=binarySearch(arr, 0, n-1, x);
        if(result==-1){
            System.out.println("No encontre el dato");
        }else {
            System.out.println("El dato esta en la pos "+result);
        }
    }
}

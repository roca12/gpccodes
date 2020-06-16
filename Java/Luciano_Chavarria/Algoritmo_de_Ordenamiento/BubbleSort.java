
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sc[] = br.readLine().split(" ");
        int arr[] = new int[sc.length];
        for (int i = 0; i < sc.length; i++) {
            arr[i] = Integer.parseInt(sc[i]);
        }
        BubbleSort(arr,arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    

    static void BubbleSort(int []arr, int n){
        if (n==1) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            BubbleSort(arr, n-1);
        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int expSeach(int arr[], int n, int x){
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(i<n && arr[i]<=x){
            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,n),x);
    
    
    public static void main(String[] args) {
       int arr[]={2,3,4,10,40};
       int x=7;
       int result=expSeach(arr,arr.length,x);
       if(result<0){
           System.out.println("dato no encontrado");
       }else{
           System.out.println("dato encontrado en la posicion: "+result);
       }
    }
}

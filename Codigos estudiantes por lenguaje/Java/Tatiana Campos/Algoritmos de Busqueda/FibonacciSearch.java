import java.util.Arrays;
import java.util.Scanner;
public class Main {
     static int min(int x, int y){
         return(x<=y)?x:y;
     }
     static int fibosearch(int arr[], int x, int n){
         
         int fibM2=0;
         int fibM1=1;
         int fibM=fibM2+fibM1;
         
         while(fibM<n){
             
             fibM2=fibM1;
             fibM1=fibM;
             fibM=fibM1+fibM2;
         }
         int offset=-1;
         while(fibM>1){
             
             int i=min((offset+fibM2),n-1);
             if(arr[i]<x){
                 fibM=fibM1;
                 fibM1=fibM2;
                 fibM2=fibM-fibM1;
                 offset=i;
                 
                 
             }else if (arr[i]>x){
                 fibM=fibM2;
                 fibM1=fibM1-fibM2;
                 fibM2=fibM-fibM1;
                 
             }else{
                 return i;
             }
         }
         if(fibM1==1 && arr[offset+1]==x){
             return offset+1;
         }
         return -1;
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {10, 22, 35, 40, 45, 50,80, 82, 85, 90, 100};
        int n = 11;
        int x = 85;
        System.out.println("Found at index: "+ fibosearch(arr, x, n));
    }
}

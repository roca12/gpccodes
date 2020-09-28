import java.util.Arrays;
import java.util.Scanner;
public class Main {
     static class Par{
           int min,max; 
        }
     static Par getMaxMin(int arr[], int n){
         Par maxmin= new Par();
         int i;
         if(n==1){
             maxmin.max=arr[0];
             maxmin.min=arr[0];
         }
         if(arr[0]>arr[1]){
             maxmin.max=arr[0];
             maxmin.min=arr[1];
         }else{
             maxmin.max=arr[1];
             maxmin.min=arr[0];
         }
         for (int j = 2; j < n; j++) {
             if(arr[j]>maxmin.max){
                 maxmin.max=arr[j];
             }else if(arr[j]<maxmin.min){
                 maxmin.min=arr[j];
             }
         }
         return maxmin;
     }
    public static void main(String[] args) {
       int arr[]={100,-77,5,-6,1000000,-1};
       int n=arr.length;
       Par result=getMaxMin(arr, n);
        System.out.println("El menor es "+result.min);
        System.out.println("El mayor es "+result.max);
    }
}

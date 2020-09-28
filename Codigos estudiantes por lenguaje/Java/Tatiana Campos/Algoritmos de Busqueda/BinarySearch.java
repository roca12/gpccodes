import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int bynarysearch(int arr[], int left,int right, int x){
       if(right>=left){
           int mid=left+(right-left)/2;
           if(arr[mid]==x){
               return mid;
           }
           if(arr[mid]>x){
               return bynarysearch(arr, left, mid-1, x);
           }
           return bynarysearch(arr, mid+1, right, x);
       } 
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,10,3,40};
        Arrays.sort(arr);
        int n=arr.length;
        int x=10;
        int result=bynarysearch(arr, 0, n-1, x);
        if(result==-1){
            System.out.println("No encontre el dato");
        }else{
            System.out.println("El dato esta en la posicion "+result);
        }
        }
    }
        
    


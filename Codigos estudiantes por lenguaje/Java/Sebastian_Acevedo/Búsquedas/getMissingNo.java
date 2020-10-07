import java.util.Scanner;

public class Main{
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,5,6,7,8};
        int missed = getMissingNo(arr, arr.length);
        System.out.println("El numero que falta es: "+missed);
        
    }
    
    static int getMissingNo(int arr[], int n){
      int x1=arr[0];
      int x2=1;
        for (int i = 1; i < n; i++) {
            x1^=arr[i];
            System.out.println(i+"->"+x1);
        }
        for (int i = 2; i <= n+1; i++) {
            x2^=i;
            System.out.println(i+"->"+x2);
        }
        return x1^x2;
    }
}


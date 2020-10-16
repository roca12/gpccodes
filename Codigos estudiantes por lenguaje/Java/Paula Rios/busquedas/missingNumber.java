import java.util.Scanner;
public class Main {
    static int getMissingNo(int a[],int n){
        int x1=a[0];
        int x2=1;
        for (int i=1; i <n; i++) {
            x1^=a[i];
            System.out.println(i+"->"+x1);
            
        }
        for (int i=2 ;i<=n+1; i++){
            x2^=i;
            System.out.println(i+"->"+x2);
        }
        return x1^x2;
    }
    public static void main(String[] args) {
      int []arr ={1,2,3,5,6,7,8};
      int missed = getMissingNo(arr,arr.length);
        System.out.println("el numero que falta es: "+missed);
      
    }
    
}

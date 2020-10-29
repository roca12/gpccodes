import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n!=0){
        int arr[]=new int [n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]);
            if(i != n-1)System.out.print(" ");
        }
        System.out.println();
        n = sc.nextInt();
    }
  }
}

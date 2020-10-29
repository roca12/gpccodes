import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a,b,c;
         while(sc.hasNext()){
            a=sc.nextInt();
            b=sc.nextInt();
            c=(a*b)-1;
             System.out.println(c);
         }
     }
}

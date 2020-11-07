
import java.util.Scanner;


public class Main {

    public static void Main(String[] args) {
        Scanner num=new Scanner(System.in);
        int opc = num.nextInt();
        for (int i = 0; i < opc; i++) {
            int a = num.nextInt();
            int b = a%10;
            int invertido = 0, resto;
            while (a > 0) {
                resto = a % 10;
                invertido = invertido * 10 + resto;
                a /= 10;
            }
            int c = invertido%10;
            System.out.println(b+c);
        }
  
    }
    
}

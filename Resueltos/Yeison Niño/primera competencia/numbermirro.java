import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        if (num1>=0&&num1<=100000){
            System.out.println(num1);
        }   else {
            System.out.println("Error");
        }
    }
    
}

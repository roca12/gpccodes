import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
                int num1 = teclado.nextInt();
                for (int i = 1;i <= num1;i++){
                
                    int a = teclado.nextInt();
                    int b = teclado.nextInt();
                    
                    
                    System.out.println(a%b);
                    
                    
                }
                
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = teclado.nextInt();
		
		for (int i = 1;i <= num1;i++){

                    int A = teclado.nextInt();
                    int B = teclado.nextInt();
                    if (A<B) {
                        System.out.println("<");
                    } 
                    if (A>B) {
                        System.out.println(">");
                    }
                    if (A==B) {
                        System.out.println("=");
                    }
		}
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = teclado.nextInt();
		
		for (int i = 1;i <= num1;i++){

                    int a = teclado.nextInt();
                    int num2 = a%10;
		    int b = 10;
                    while (a>9) {
			a/=b;
                    }
                    System.out.println(a+num2);
		}
	}

}

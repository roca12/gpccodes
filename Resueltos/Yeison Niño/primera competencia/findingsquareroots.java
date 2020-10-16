import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
                int num1 = teclado.nextInt();
                for (int i = 1;i <= num1;i++){
                
                    double n= teclado.nextInt();
                    if (n>=1&&n<=10000){
                        double t = Math.sqrt(n);
                        int num2 = (int) Math.floor(t);
                        System.out.println(num2);
                    
                    }
                }
                
	}

}

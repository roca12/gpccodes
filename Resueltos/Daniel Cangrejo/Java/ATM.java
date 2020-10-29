import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int retiro = lector.nextInt();
		double saldo = lector.nextDouble();
		if((retiro<(saldo-0.50)) && (retiro %5 == 0) ) {
			double saldof = saldo-(retiro+0.50);
			System.out.println(String.format("%.2f", saldof));
		}else {
			System.out.println(String.format("%.2f", saldo));
		}
		
	}

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int retiro = lector.nextInt();
		double saldo = lector.nextDouble();
		if(retiro>saldo);
		else {
		if((retiro<(saldo-0.50)) && retiro%5 == 0)saldo = saldo-0.50-retiro;
		}
		System.out.println(String.format("%.2f", saldo));
	}

}

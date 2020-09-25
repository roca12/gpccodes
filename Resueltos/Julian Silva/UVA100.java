import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double n=sc.nextDouble();
			double p=sc.nextDouble();
			double z=Math.pow(p, 1/n);
			System.out.printf("%.0f\n",z);

		}

	}
}

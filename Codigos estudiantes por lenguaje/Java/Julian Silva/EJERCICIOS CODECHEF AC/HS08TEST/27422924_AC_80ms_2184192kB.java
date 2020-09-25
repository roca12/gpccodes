import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = 0.50, s = sc.nextDouble(),c2 = sc.nextDouble();
		if (s % 5 != 0 || c2 < s + c) {
			System.out.printf("%1.2f\n", c2);
		} else {
			System.out.printf("%1.2f\n", ((c2 - c) - s));
		}
	}
}
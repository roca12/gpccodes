import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			double v=(double)Math.sqrt(c);
			System.out.printf("%1.0f\n",v);;
			
		}
	}
}

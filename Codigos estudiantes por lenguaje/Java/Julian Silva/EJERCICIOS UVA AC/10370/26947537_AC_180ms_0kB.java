import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int[] vec = new int[n];
			double total = 0;
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				vec[j] = x;
				total += x;
			}
			total /= n;
			double aux = 0;
			for (int j = 0; j < n; j++) {
				if (vec[j] > total)
					aux++;
			}
			System.out.printf("%.3f", (aux * 100.0 / n));
			System.out.println("%");
		}
	}

}
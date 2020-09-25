import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int x = sc.nextInt();
			int[] vec = new int[x];
			int cont = 0;
			for (int j = 0; j < x; j++) {
				vec[j] = sc.nextInt();
				for (int j2 = 0; j2 < j; j2++) {
					if (vec[j] < vec[j2])
						cont++;
				}
			}
			System.out.println("Optimal train swapping takes " + cont + " swaps.");
		}
	}
}
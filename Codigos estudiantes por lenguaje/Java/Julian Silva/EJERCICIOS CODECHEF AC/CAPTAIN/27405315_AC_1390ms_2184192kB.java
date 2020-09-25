import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int x = sc.nextInt();
			int cont = 1;
			int[] vec = new int[x];
			for (int j = 0; j < x; j++) {
				vec[j] = sc.nextInt();
			}
			Arrays.sort(vec);
			for (int j = 0; j < x - 2; j++) {
				if ((vec[j] + vec[j + 1]) > vec[j + 2]) {
					System.out.println("Yes");
					cont = 0;
					break;
				}
			}
			if (cont == 1)
				System.out.println("No");
		}
	}
}

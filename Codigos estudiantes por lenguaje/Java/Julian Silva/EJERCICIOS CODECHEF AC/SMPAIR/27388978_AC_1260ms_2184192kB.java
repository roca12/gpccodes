import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int[] vec = new int[n];
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				vec[j] = x;
			}
			Arrays.sort(vec);
			System.out.println(vec[0] + vec[1]);
		}
	}
}

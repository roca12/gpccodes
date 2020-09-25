import java.util.*;

public class Main {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 1; i <= c; i++) {
			int x = sc.nextInt(),cont = 0;
			for (int j = 1; j <= x; j++) {
				cont = Math.max(cont, sc.nextInt());
			}
			System.out.println("Case " + i + ": " + cont);
		}
	}

}
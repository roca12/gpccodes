import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			long x = sc.nextLong();
			long cont = 0;
			while (x > 0) {
				long divi = x % 10;
				if (divi == 4) {
					cont++;
				}
				x /= 10;
			}
			System.out.println(cont);
		}

	}
}
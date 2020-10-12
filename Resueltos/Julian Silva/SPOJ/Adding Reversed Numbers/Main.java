import java.util.*;

public class Main{
	static int reversa(int x) {
		int vec[] = new int[40];
		int n = 0;
		while (x > 0) {
			vec[n++] = x % 10;
			x /= 10;
		}
		int aux = 0;
		for (int i = 0; i < n; i++) {
			aux += (int) Math.pow(10, n - i - 1) * vec[i];
		}
		return aux;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int x, y, aux = 0;
		for (int i = 0; i < c; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			x = reversa(x);
			y = reversa(y);
			aux = x + y;
			aux = reversa(aux);
			System.out.println(aux);

		}

	}

}

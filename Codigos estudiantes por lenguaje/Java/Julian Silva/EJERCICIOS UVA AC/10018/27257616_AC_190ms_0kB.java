import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int aux = 0;
			long x = sc.nextLong();
			long inter = numIn(x);
			while (x != inter) {
				x += inter;
				inter = numIn(x);
				aux++;
			}
			System.out.println(aux + " " + x);
		}
	}

	static long numIn(long x) {
		long aux = 0;
		while (x > 0) {
			aux = aux * 10 + x % 10;
			x /= 10;
		}
		return aux;
	}
}
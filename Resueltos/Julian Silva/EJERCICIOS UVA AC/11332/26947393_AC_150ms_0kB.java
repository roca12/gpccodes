import java.util.*;

public class Main {

	static int suma(int n) {
		int cont = 0;
		for (int i = n; i != 0; i = i / 10) {
			cont = cont + i % 10;
		}
		if (cont < 10) {
			return cont;
		} else {
			return suma(cont);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while (n != 0) {
			System.out.println(suma(n));
			n = sc.nextInt();
		}
	}

}


import java.util.Scanner;

public class Main {
	public static int seq(String str, int x, int y) {
		int tam = str.length();
		for (int i = 0; i < tam; i++) {
			if (str.charAt((x + i) % tam) < str.charAt((y + i) % tam))
				return x;
			if (str.charAt((x + i) % tam) > str.charAt((y + i) % tam))
				return y;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			String str = sc.next();
			int aux = 0;
			for (int j = 1; j < str.length(); ++j) {
				aux = seq(str, aux, j);
			}
			str = str.substring(aux) + str.substring(0, aux);
			System.out.println(str);
		}
	}
}
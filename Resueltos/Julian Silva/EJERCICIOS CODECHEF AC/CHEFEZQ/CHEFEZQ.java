import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long c = sc.nextLong();
		for (int j = 0; j < c; j++) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			long vec[] = new long[n];
			long cont = 0, dia = 0, aux = 0;
			for (int i = 0; i < n; i++) {
				vec[i] = sc.nextLong();
				cont += vec[i];
			}

			for (int i = 0; i < n - 1; i++) {
				if (vec[i] < x) {
					aux = 1;
					dia = i;
					break;
				}
				vec[i + 1] += (vec[i] - x);
			}

			if (aux == 1) {
				pw.println(dia + 1);
			} else {
				dia = (cont / x) + 1;
				pw.println(dia);
			}

		}
		pw.close();
		
	}
}

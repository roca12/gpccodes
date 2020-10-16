import java.util.*;

public class ejercicios {
	static int a = 256;

	static void sort(char vec[]) {
		char salida[] = new char[vec.length];
		int count[] = new int[a];
		for (int i = 0; i < a; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < vec.length; i++) {
			++count[vec[i]];
		}
		for (int i = 1; i <= a - 1; i++) {
			count[i] += count[i - 1];
		}
		for (int i = vec.length - 1; i >= 0; i--) {
			salida[count[vec[i]] - 1] = vec[i];
			--count[vec[i]];
		}
		for (int i = 0; i < vec.length; i++) {
			vec[i] = salida[i];
		}
	}

	static void soutvec(char vec[]) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char vec[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		sort(vec);
		System.out.print("array de caracteres ordenado: ");
		soutvec(vec);
	}
}

import java.util.*;

public class Main {
	static void antes(int vec[]) {
		int cont = vec[0];
		int i = 0;
		for (i = 0; i < vec.length-1; i++) {
			vec[i] = vec[i + 1];
		}
		vec[i] = cont;
	}

	private static int[] despues(int vec[], int start) {
		int b = 1;
		int x = 1;
		while (b != vec.length) {
			if ((vec[start] & vec[x]) > 0) {
				start++;
				int aux = vec[start];
				vec[start] = vec[x];
				vec[x] = aux;
				b++;
				x = b;
			} else {
				x++;
				if (x == vec.length) {
					b = vec.length;
				}
			}
		}
		for (int j = 0; j < vec.length - 1; j++) {
			if ((vec[j] & vec[j + 1]) <= 0) {
				int a[] = { -1 };
				return a;
			}
		}
		return vec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		while (c-- > 0) {
			int tam = sc.nextInt();
			int vec[] = new int[tam];
			for (int i = 0; i < vec.length; i++) {
				vec[i] = i + 1;
			}
			int i = 0;
			for (i = 0; i < vec.length; i++) {
				antes(vec);
				int result[] = despues(vec.clone(), 0);
				if (result[0] == -1) {
					if (i == vec.length - 1) {
						System.out.println(-1);
						break;
					}
					continue;
				} else {
					for (int j : result) {
						System.out.print(j + " ");
					}
					System.out.println();
					break;
				}

			}
		}
		sc.close();
	}
	
}

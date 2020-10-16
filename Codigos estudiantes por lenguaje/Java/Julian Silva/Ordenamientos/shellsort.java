import java.util.*;

public class ejercicios {
	static void soutArray(int vec[]) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	static int sort(int vec[]) {
		int n = vec.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int aux = vec[i];
				int j;
				for (j = i; j >= gap && vec[j - gap] > aux; j -= gap) {
					vec[j] = vec[j - gap];
				}
				vec[j] = aux;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int vec[] = new int[a = sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
		}
		System.out.println("vector sin ordenar");
		soutArray(vec);
		sort(vec);
		System.out.println("vector despues de ordenar");
		soutArray(vec);
	}
}

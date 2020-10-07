import java.util.*;
public class ejercicios {
	static void compara_e_intercambia(int vec[], int i, int j, int dir) {
		if ((vec[i] > vec[j] && dir == 1) || (vec[i] < vec[j] && dir == 0)) {
// intercambiando elementos 
			int temp = vec[i];
			vec[i] = vec[j];
			vec[j] = temp;
		}
	}

	static void bitonicMerge(int vec[], int low, int cont, int dir) {
		if (cont > 1) {
			int k = cont / 2;
			for (int i = low; i < low + k; i++) {
				compara_e_intercambia(vec, i, i + k, dir);
			}
			bitonicMerge(vec, low, k, dir);
			bitonicMerge(vec, low + k, k, dir);
		}
	}

	static void bitonicSort(int vec[], int low, int cont, int dir) {
		if (cont > 1) {
			int k = cont / 2;
// Ordena en orden ascendente, dir es 1
			bitonicSort(vec, low, k, 1);
// ordena en orden descendente, dir es 0

			bitonicSort(vec, low + k, k, 0);
// une toda la secuencia en orden ascendente
			bitonicMerge(vec, low, cont, dir);
		}
	}

	static void sort(int vec[], int N, int up) {
		bitonicSort(vec, 0, N, up);
	}

	/* Imprimir array */
	static void printArray(int vec[]) {
		int n = vec.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a;
		int vec[] = new int[a=sc.nextInt()];
		int up = 1;
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		sort(vec, vec.length, up);
		System.out.println("\nArray ordenado");
		printArray(vec);
	}
}

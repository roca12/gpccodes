import java.util.*;

public class ejercicios {
	static int particion(int vec[], int low, int high) {
		int pivote = vec[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			/* Si el actual elemento es más pequeño p igual que el pivote */
			if (vec[j] <= pivote) {
				i++;
				// intercambia arr[i] y arr[j]
				int aux = vec[i];
				vec[i] = vec[j];
				vec[j] = aux;
			}
		}
		// Intercambia arr[i+1] y arr[high] (o pivote)
		int aux = vec[i + 1];
		vec[i + 1] = vec[high];

		vec[high] = aux;

		return i + 1;

	}

	/*
	 * arr[] --> Array que sera ordenado, low --> indice inicial, high --> indice
	 * final
	 */
	static void sort(int vec[], int low, int high) {
		if (low < high) {
			/* pi esta particionando indices, arr[pi] is now at right place */
			int pi = particion(vec, low, high);
			// Recursivamente ordena elementos antes de
			// la partición y despues de la partición
			sort(vec, low, pi - 1);
			sort(vec, pi + 1, high);
		}
	}

	/* Imprimir array */
	static void sout(int vec[]) {
		int x = vec.length;
		for (int i = 0; i < x; ++i) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		int vec[] = new int[a = sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
		}

		sort(vec, 0, vec.length - 1);
		System.out.println("Array ordenado");
		sout(vec);
	}
}

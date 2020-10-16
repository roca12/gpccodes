import java.util.*;

public class ejercicios {

	static void pigeonhole_sort(int vec[], int n) {
		int minimo = vec[0];
		int maximo = vec[0];
		int rango, i, j, indice;
		for (int a = 0; a < n; a++) {
			if (vec[a] > maximo) {
				maximo = vec[a];
			}
			if (vec[a] < minimo) {
				minimo = vec[a];
			}
		}
		rango = maximo - minimo + 1;

		int[] vecphole = new int[rango];
		Arrays.fill(vecphole, 0);
		for (i = 0; i < n; i++) {
			vecphole[vec[i] - minimo]++;
		}
		indice = 0;
		for (j = 0; j < rango; j++) {
			while (vecphole[j]-- > 0) {
				vec[indice++] = j + minimo;
			}
		}
	}
	static void soutvec(int vec[]) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random r= new Random();
		int[] vec = new int [20];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=r.nextInt(100);
		}
		System.out.print("Array ordenado : ");
		pigeonhole_sort(vec, vec.length);
		soutvec(vec);
	}
}

import java.util.*;

public class ejercicios {
	static int getMax(int vec[], int n) {
		int max = vec[0];
		for (int i = 1; i < n; i++) {
			if (vec[i] > max) {
				max = vec[i];
			}
		}
		return max;
	}

	static void countSort(int vec[], int n, int exp) {
		int salida[] = new int[n];
		int cont[] = new int[10];
		Arrays.fill(cont, 0);
		for (int i = 0; i < n; i++) {
			cont[(vec[i] / exp) % 10]++;
		}
		for (int i = 1; i < 10; i++) {
			cont[i] += cont[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) {
			salida[cont[(vec[i] / exp) % 10] - 1] = vec[i];
			cont[(vec[i] / exp) % 10]--;

		}
		for (int i = 0; i < n; i++) {
			vec[i] = salida[i];
		}
	}

	static void radixsort(int vec[], int n) {
		int m = getMax(vec, n);
		for (int exp = 1; m / exp > 0; exp *= 10) {
			countSort(vec, n, exp);
		}
	}
	static void sout(int vec[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(vec[i]+" ");
		}
	}
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int vec[]= new int [a=sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i]= sc.nextInt();
		}
		int n=vec.length;
		radixsort(vec, n);
		sout(vec, n);
	}
}

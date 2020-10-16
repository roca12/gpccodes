import java.util.*;

public class ejercicios {
	static void mergeSort(int vec[], int left, int m, int rigth) {
		int n1 = m - left + 1;
		int n2 = rigth - m;
		int vecL[] = new int[n1];
		int vecR[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			vecL[i] = vec[left + i];
		}
		for (int i = 0; i < n2; i++) {
			vecR[i] = vec[m + 1 + i];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (vecL[i] <= vecR[j]) {
				vec[k] = vecL[i];
				i++;
			} else {
				vec[k] = vecR[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			vec[k] = vecL[i];
			i++;
			k++;
		}
		while (j < n2) {
			vec[k] = vecL[i];
			j++;
			k++;
		}
	}

	static void Sort(int vec[], int left, int rigth) {
		if (left < rigth) {
			int m = (left + rigth) / 2;
			Sort(vec, left, m);
			Sort(vec, m + 1, rigth);
			mergeSort(vec, left, m, rigth);
		}
	}

	static void sout(int vec[]) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int vec[] = new int[a = sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
		}
		System.out.println("Su vector es: ");
		sout(vec);
		Sort(vec, 0, vec.length - 1);
		System.out.println("\nSu vector ordenado es:");
		sout(vec);
	}

}

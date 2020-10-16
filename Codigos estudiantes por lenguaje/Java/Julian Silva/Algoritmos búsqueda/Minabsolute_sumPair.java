import java.util.*;

public class Main3 {
	static void minAbsolute(int vec[], int vec_tam) {
		int left, right, min_sum = vec[0] + vec[1], sum, min_left = 0, min_right = 1;
		if (vec_tam < 2) {
			System.out.println("Entrada Invalida");
			return;
		}
		for (left = 0; left < vec_tam - 1; left++) {
			for (right = left + 1; right < vec_tam; right++) {
				sum = vec[left] + vec[right];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min_left = left;
					min_right = right;
				}
			}
		}
		System.out.println(
				"Los dos elementos los cuales tiene la suma minima son: " + vec[min_left] + " y " + vec[min_right]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int vec[] = new int[c];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
		}
		int vec_tam = vec.length;
		minAbsolute(vec, vec_tam);
	}
}

import java.util.*;

public class ejercicios {
	static void sort(int vec[]) {
		for (int i = 1; i < vec.length; i++) {
			int x = vec[i];
			int j = Math.abs(Arrays.binarySearch(vec, 0, i, x) + 1);
			System.arraycopy(vec, j, vec, j + 1, i - j);
			vec[j]=x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int vec[] = new int[a = sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
		}
		sort(vec);
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+"\t");
		}

	}

}

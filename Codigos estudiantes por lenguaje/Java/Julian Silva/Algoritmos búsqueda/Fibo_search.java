import java.util.*;

public class Main3 {
	static int min(int x, int y) {
		return (x <= y) ? x : y;
	}

	static int fiboSearch(int vec[], int x,  int n) {
		int FibMMm2 = 0;
		int FibMM1 = 1;
		int FibM = FibMMm2 + FibMM1;
		while (FibM < n) {
			FibMMm2 = FibMM1;
			FibMM1 = FibM;
			FibM = FibMMm2 + FibMM1;
		}
		int fuera = -1;
		while (FibM > 1) {
			int i = min(fuera + FibMMm2, n - 1);
			if (vec[i] < x) {
				FibM = FibMM1;
				FibMM1 = FibMM1 - FibMMm2;
				FibMMm2 = FibM - FibMM1;
			} else {
				return i;
			}
		}
		if (FibMM1 == 1 && vec[fuera + 1] == x) {
			return fuera + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		int vec[]=new int[c];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int x=sc.nextInt();
		System.out.println("encontrado en el indice: "+fiboSearch(vec, x, n));
	}
}

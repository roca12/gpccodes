import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), aux, iz = 0, de = 0, ar = 0, ab = 0;
		int matrix[][] = new int[c][c];
		for (int i = 0; i < c; i++)
			for (int j = 0; j < c; j++)
				matrix[i][j] = sc.nextInt();

		if (c % 2 == 1) {
			aux = c / 2;
		} else {
			aux = c / 2 - 1;
		}
		while (iz <= aux) {
			for (int i = iz, j = iz; j < c - de; j++) 
				System.out.print(matrix[i][j] + " ");
				ar++;
			
			for (int i = ar, j = c - 1 - de; i < c - de; i++) 
				System.out.print(matrix[i][j] + " ");
				de++;
			

			for (int i = c - 1 - ab, j = c - 1 - de; j >= iz; j--) 
				System.out.print(matrix[i][j] + " ");
				ab++;
			
			for (int i = c - 1 - ab, j = iz; i >= ar; i--) 
				System.out.print(matrix[i][j] + " ");
				iz++;
			

		}
		System.out.println();

	}
}
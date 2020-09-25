import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] vector = new int[x];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=sc.nextInt();
		}
		Arrays.sort(vector);
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

}
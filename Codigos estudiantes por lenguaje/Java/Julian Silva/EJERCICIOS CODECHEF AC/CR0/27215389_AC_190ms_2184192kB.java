import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for (int i = 0; i < c; i++) {
			int  x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			System.out.println((x - z) / y);
		}
	}
}
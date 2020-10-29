elect Code
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int t = sc.nextInt();
		int n [] = new int[t];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		    r = (int) Math.sqrt (n[i]);
		    System.out.println(r);
		}
	}

}

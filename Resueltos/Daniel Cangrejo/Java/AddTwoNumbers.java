import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int t = sc.nextInt();
		int n [] = new int [t];
		int n2 [] = new int [t];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n2.length; j++) {
			n[i] = sc.nextInt(); n2[j] = sc.nextInt();
		        r = n[i] + n2[j];
		        System.out.println(r);
		        break;
			}
		}

	}

}

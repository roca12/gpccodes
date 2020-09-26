import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rep = sc.nextInt();
		for (int i = 0; i < rep; i++) {
			   int fil = sc.nextInt();
			   int col = sc.nextInt();
			   System.out.println((fil/3)*(col/3));
		}
	}
}

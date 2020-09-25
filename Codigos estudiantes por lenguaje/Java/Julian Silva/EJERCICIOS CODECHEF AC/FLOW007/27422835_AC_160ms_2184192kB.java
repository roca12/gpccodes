
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int num, inter = 0;
			num = sc.nextInt();
			while (num != 0) {
				int cont = num % 10;
				inter = inter * 10 + cont;
				num /= 10;
			}
			System.out.println(inter);
		}
	}
}
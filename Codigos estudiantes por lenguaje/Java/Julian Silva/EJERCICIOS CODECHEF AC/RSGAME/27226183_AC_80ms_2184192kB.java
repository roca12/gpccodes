import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double y;
		int x;
		for (int i = 0; i < c; i++) {
			x = 0;
			y = sc.nextInt();
			while (y != 1) {
				if (Math.sqrt(y) - Math.floor(Math.sqrt(y)) == 0)
					y = Math.sqrt(y);
				else
					y = y - 1;
				x++;
			}
			if (x == 1 || x % 2 != 0)
				System.out.println("GANDEY");
			else
				System.out.println("GHATAK");
		}
	}

}
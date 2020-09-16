import java.util.*;

public class Main {
	static int square(int n) {
		if (n == 0)
			return 0;
		if (n < 0)
			n = -n;
		int x = n >> 1;
	
		if ((n & 1) > 0) {
			return ((square(x) << 2) + (x << 2) + 1);

		} else {
			return ((square(x) << 2));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "->" + square(i));
		}
	}

}

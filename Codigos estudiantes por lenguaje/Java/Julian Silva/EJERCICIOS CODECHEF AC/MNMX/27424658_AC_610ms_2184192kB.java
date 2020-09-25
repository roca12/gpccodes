import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		for (int i = 1; i <= c; i++) {
			long num = sc.nextLong();
			long min = Long.MAX_VALUE;
			for (long j = 0; j < num; j++)
				min = Math.min(sc.nextLong(), min);
			System.out.println((min * (num - 1)));
		}

	}
}

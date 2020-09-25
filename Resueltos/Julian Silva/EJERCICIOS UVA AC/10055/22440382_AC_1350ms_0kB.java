
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			long rest =Math.abs(a-b);

			System.out.println(rest);
		}
	}

}

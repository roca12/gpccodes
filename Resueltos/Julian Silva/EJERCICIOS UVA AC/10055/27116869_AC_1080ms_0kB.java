import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			System.out.println(Math.abs(x - y));
		}
	}
}
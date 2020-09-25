import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int x = sc.nextInt(),y = sc.nextInt();
			if(x<y) {
				System.out.println("<");
			}else if(x>y) {
				System.out.println(">");
			}else {
				System.out.println("=");
			}
		}
	}
}
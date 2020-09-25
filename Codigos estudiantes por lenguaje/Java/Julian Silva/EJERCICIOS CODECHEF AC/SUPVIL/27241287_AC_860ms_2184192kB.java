import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			String nombres = null;
			String stvec[] = new String[n];
			for (int j = 0; j < n; j++) {
				stvec[j] = sc.next();
			}
			int personas = 0;
			for (int j = 0; j < n; j++) {
				int a = stvec[j].length();
				if (stvec[j].endsWith("man"))
					personas++;
				else
					personas--;
				if (personas == 2) {
					nombres = "superheroes";
					break;
				} else if (personas == -3) {
					nombres = "villains";
					break;
				}
			}
			if (nombres == null) {
				nombres = "draw";
			}
			System.out.println(nombres);
		}
	}
}
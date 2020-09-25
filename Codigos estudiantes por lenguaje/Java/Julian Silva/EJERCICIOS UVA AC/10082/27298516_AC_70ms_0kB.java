import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, tec;
		int tam;
		tec = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while (sc.hasNext()) {
			str = sc.nextLine();
			tam = str.length();
			for (int i = 0; i < tam; i++) {
				if (str.charAt(i) == ' ')
					System.out.print(" ");
				else
					System.out.print(tec.charAt(tec.indexOf(str.charAt(i)) - 1));
			}
			System.out.println();
		}

	}

}
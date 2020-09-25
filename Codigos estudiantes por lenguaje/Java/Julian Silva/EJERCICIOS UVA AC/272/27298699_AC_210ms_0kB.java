import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, str2;
		int x = 1;
		while (sc.hasNext()) {
			str = sc.nextLine();
			str2 = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).compareTo("\"") == 0) {
					if (x % 2 == 1) {
						str2 += "``";
					} else {
						str2 += "''";
					}
					x++;
				} else {
					str2 += str.substring(i, i + 1);
				}
			}
			System.out.println(str2);
		}
	}
}
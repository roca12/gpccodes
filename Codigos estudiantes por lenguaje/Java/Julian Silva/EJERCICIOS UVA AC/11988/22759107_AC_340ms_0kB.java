import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String a = null;

		while ((a=sc.readLine())!=null) {
			LinkedList<Character> brok = new LinkedList<>();
			int p = 0;
			for (char c : a.toCharArray()) {
				if (c == '[') {
					p = 0;

				} else if (c == ']') {
					p = brok.size();

				} else {
					brok.add(p++, c);
				}
			}
			StringBuilder b = new StringBuilder();
			for (char c : brok) {
				b.append(c);
			}
			System.out.println(b.toString());

		}

	}
}

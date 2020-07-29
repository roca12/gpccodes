import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter bw = new OutputStreamWriter(System.out);
		String str;
		while ((str = br.readLine()) != null) {
			str=str.replaceAll("[^a-zA-Z]", " ");
			StringTokenizer st = new StringTokenizer(str);
			ArrayList<String> list = new ArrayList<String>();
			while (st.hasMoreTokens()) {
				list.add(st.nextToken());
			}			
			for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("...")) {
				list.remove(i);
			}
			}
			bw.write(Integer.toString(list.size()) + "\n");
			bw.flush();
		}
	}

}


import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[]args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int c=Integer.parseInt(br.readLine());
		HashMap<String,Integer> masc=new HashMap<>();
		for (int i=0;i<c;i++) {
			String pais=new StringTokenizer(br.readLine()).nextToken();
			if (!masc.containsKey(pais)) {
				masc.put(pais, 0);
			}
			masc.put(pais,masc.get(pais)+1);
		}
		
		Set<String> map=masc.keySet();
		String [] vec=map.toArray(new String [map.size()]);
		Arrays.sort(vec);
		
		StringBuilder sc=new StringBuilder();
		for (int i=0;i<vec.length;i++) {
			sc.append(vec[i]);
			sc.append(" ");
			sc.append(masc.get(vec[i]));
			sc.append("\n");
		}
		System.out.print(sc.toString());
	}
}

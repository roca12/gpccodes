import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class List_of_Conquests {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(br.readLine());
		ArrayList<String> lista = new ArrayList<>();
		TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();
		for (int i = 0; i < casos; i++) {
			String entrada = br.readLine();
			StringTokenizer st = new StringTokenizer(entrada);
			lista.add(st.nextToken());
		}
		for (int i = 0; i < lista.size(); i++) {
			int contador = 0;
			for (int j = 0; j < lista.size(); j++) {
				if(lista.get(j).equals(lista.get(i))) {
				contador++;
				}
			}
		mapa.put(lista.get(i),contador);
		}
		mapa.entrySet().forEach(entry -> System.out.println(entry.getKey() +" "+ entry.getValue()));
	}
}

import java.util.Scanner;
import java.util.TreeMap;

public class Stacking_Cups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			TreeMap<Integer,String> mapa = new TreeMap<>();
			int tazas = sc.nextInt();
			int auxiliar = 0;
			for (int i = 0; i < tazas; i++) {				
				String parte1 = sc.next();
				String parte2 = sc.next();	
				try {
					auxiliar = Integer.parseInt(parte1);
					auxiliar /= 2;
					mapa.put(auxiliar, parte2);					
				}catch(NumberFormatException e) {
					auxiliar = Integer.parseInt(parte2);
					mapa.put(auxiliar, parte1);					
					}
			}
			mapa.entrySet().forEach(entry -> System.out.println(entry.getValue()));
		}
	}
}

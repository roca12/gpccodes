import java.util.HashSet;
import java.util.Scanner;

public class Testing_Robot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int tam = sc.nextInt(), posi = sc.nextInt();
			String movimientos = sc.next();
			String [] lineal = movimientos.split("");
			HashSet<Integer> visitados = new HashSet<>();
			int temporal = posi;
			visitados.add(posi);
			for (int j = 0; j < lineal.length; j++) {
				if(lineal[j].equals("R")) {
					temporal+=1;
					visitados.add(temporal);
				}else if(lineal[j].equals("L")) {
					temporal -=1;
					visitados.add(temporal);
				}
			}
			System.out.println(visitados.size());
		}
	}
}
